package com.monopoly.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Classe impiegata nella gestione delle informazioni esclusive di una sessione di gioco.
 * <br><br>
 * Detiene:
 * <ul>
 *  <li>Informazioni stabilite ad inizio sessione (fornite da {@link com.monopoly.app.InizializzatorePartita});</li>
 *  <li>Indice del giocatore che effettua il turno attuale;</li>
 *  <li>Numero di giri effettuati.</li>
 *</ul>
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class GestorePartita implements Serializable {
    
    public static final long serialVersionUID = 1L;
    private final InizializzatorePartita inizializzatorePartita;
    private Integer[] ordineGiocatori;
    private int ordineGiocatoriIndex;
    private int giri;

    /**
     * Costruttore della classe - Genera un'istanza di tipo {@code GestorePartita} con i valori forniti in input.
     *
     * @param inizializzatorePartita istanza di InizializzatorePartita (vedi {@link com.monopoly.app.InizializzatorePartita})
     */
    public GestorePartita(InizializzatorePartita inizializzatorePartita) {
        this.inizializzatorePartita = inizializzatorePartita;
        this.ordineGiocatori = this.inizializzatorePartita.AssegnazioneOrdineGiocatori();
        this.ordineGiocatoriIndex = 0;
        this.giri = 0;
    }
    
    public Integer[] getOrdineGiocatori() {
        return this.ordineGiocatori;
    }
    
    public int getOrdineGiocatoriIndex() {
        return this.ordineGiocatoriIndex;
    }
    
    public int getGiri() {
        return this.giri;
    }
    
    public void setOrdineGiocatori(Integer[] ordineGiocatori) {
        this.ordineGiocatori = ordineGiocatori;
    }
    
    public void setGiri(int giri) {
        this.giri = giri;
    }
    
    public void setOrdineGiocatoriIndex(int ordineGiocatoriIndex) {
        this.ordineGiocatoriIndex = ordineGiocatoriIndex;
    }

    /**
     * Salva l'istanza della classe GestorePartita in 'com.monopoly/savedcontent/GestorePartita.sr'.
     *
     * @throws IOException nel caso di fallito salvataggio.
     */
    public void saveGestorePartita() throws IOException {
        FileOutputStream fileOS = new FileOutputStream("src/main/java/com/monopoly/savedcontent/GestorePartita.sr");
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
        
        objectOS.writeObject(this);
        
        fileOS.close();
        objectOS.close();
    }

    /**
     * Carica l'istanza della classe GestorePartita in 'com.monopoly/savedcontent/GestorePartita.sr'.
     *
     * @return In caso di file trovato e correttamente caricato: ultima istanza salvata di {@code gestorePartita}.<br>
     * In caso di file non trovato: nuova istanza di {@code gestorePartita}.<br>
     * In caso di IOException o ClassNotFoundException: {@code null}
     */
    public GestorePartita loadGestorePartita() {
        FileInputStream fileIS;
        ObjectInputStream objectIS;
        GestorePartita gestorePartita;
        
        try {
            fileIS = new FileInputStream("src/main/java/com/monopoly/savedcontent/GestorePartita.sr");
            objectIS = new ObjectInputStream(fileIS);
            
            gestorePartita = (GestorePartita)objectIS.readObject();

            fileIS.close();
            objectIS.close();

            return gestorePartita;
        } catch(FileNotFoundException e) {
            return new GestorePartita(this.inizializzatorePartita);
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
