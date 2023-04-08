package com.monopoly.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe improntata alla collezione e gestione dei contratti di gioco.
 * Implementa l'interfaccia {@link Serializable} per salvare lo stato di ogni oggetto di tipo {@code GestoreContratti} su file.
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
public class GestoreContratti implements Serializable{

    public static final long serialVersionUID = 1L;
    private final ArrayList<Contratto> contratti;
    private static GestoreContratti instance = new GestoreContratti();

    /**
     *  Istanzia il gestore contratti; genera un'ArrayList vuoto e lo popola con i contratti standard di gioco (con i loro rispettivi parametri).
     */
    private GestoreContratti(){
        contratti = new ArrayList<>();
        contratti.add(new Contratto("Vicolo Corto", 60, 2, true));
        contratti.add(new Contratto("Vicolo Stretto", 60, 4, true));
        contratti.add(new Contratto("Bastioni Gran Sasso", 100, 6, true));
        contratti.add(new Contratto("Viale Monterosa", 100, 6, true));
        contratti.add(new Contratto("Viale Vesuvio", 120, 8, true));
        contratti.add(new Contratto("Via Accademia", 140, 10, true));
        contratti.add(new Contratto("Corso Ateneo", 140, 10, true));
        contratti.add(new Contratto("Piazza Universita'", 160, 12, true));
        contratti.add(new Contratto("Via Verdi", 180, 14, true));
        contratti.add(new Contratto("Corso Raffaello", 180, 14, true));
        contratti.add(new Contratto("Piazza Dante", 200, 16, true));
        contratti.add(new Contratto("Via Marco Polo", 220, 18, true));
        contratti.add(new Contratto("Corso Magellano", 220, 18, true ));
        contratti.add(new Contratto("Largo Colombo", 240, 20, true));
        contratti.add(new Contratto("Viale Constantino", 260, 22, true));
        contratti.add(new Contratto("Viale Traiano", 260, 22, true));
        contratti.add(new Contratto("Piazza Giulio Cesare", 280, 24, true));
        contratti.add(new Contratto("Via Roma", 300, 26, true));
        contratti.add(new Contratto("Corso Impero", 300, 26, true));
        contratti.add(new Contratto("Largo Augusto", 320, 28, true));
        contratti.add(new Contratto("Viale dei Giardini", 350, 35, true));
        contratti.add(new Contratto("Parco della Vittoria", 400, 40, true));
        contratti.add(new Contratto("Stazione Sud", 200, 25, true));
        contratti.add(new Contratto("Stazione Nord", 200, 25, true));
        contratti.add(new Contratto("Stazione Est", 200, 25, true));
        contratti.add(new Contratto("Stazione Ovest", 200, 25, true));

    }

    public static GestoreContratti getInstance(){
        return instance;
    }

    /**
     * @return ArrayList dei contratti del tabellone di gioco.
     */
    public ArrayList<Contratto> getContratti(){
        return contratti;
    }

    /**
     * Salva l'istanza della classe GestoreContratti in 'com.monopoly/savedcontent/GestoreContrattri.sr'.
     *
     * @throws IOException nel caso di fallito salvataggio.
     */
    public void saveGestoreContratti() throws IOException {
        FileOutputStream fileOS = new FileOutputStream("src/main/java/com/monopoly/savedcontent/GestoreContratti.sr");
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
        
        objectOS.writeObject(this);
        
        fileOS.close();
        objectOS.close();
    }

    /**
     * Carica l'istanza della classe GestoreContratti in 'com.monopoly/savedcontent/GestoreContrattri.sr'.
     *
     * @return In caso di file trovato e correttamente caricato: ultima istanza salvata di {@code gestoreContratti}.<br>
     * In caso di file non trovato: nuova istanza di {@code gestoreContratti}.<br>
     * In caso di IOException o ClassNotFoundException: {@code null}
     */
    public GestoreContratti loadGestoreContratti(){
        FileInputStream fileIS = null;
        ObjectInputStream objectIS = null;
        
        try{
            fileIS = new FileInputStream("src/main/java/com/monopoly/savedcontent/GestoreContratti.sr");
            objectIS = new ObjectInputStream(fileIS);
            
            GestoreContratti gestoreContratti = (GestoreContratti) objectIS.readObject();
            
            fileIS.close();
            objectIS.close();
            
            return gestoreContratti;
            
        }catch(FileNotFoundException e){
            return new GestoreContratti();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
        
    }
}
