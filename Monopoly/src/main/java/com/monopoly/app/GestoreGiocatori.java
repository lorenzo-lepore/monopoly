package com.monopoly.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Classe impiegata nella gestione di una lista di giocatori.
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
public class GestoreGiocatori implements Serializable{
    
    public static final long serialVersionUID = 1L;
    private final ArrayList<Giocatore> giocatori;
    private int numeroGiocatori;

    private final GestoreContratti gestoreContratti;

    public GestoreGiocatori(){
        this.giocatori = new ArrayList<>();
        this.numeroGiocatori = 0;
        this.gestoreContratti = GestoreContratti.getInstance();
    }

    /**
     * Inserisce un oggetto {@code Giocatore} nell'ArrayList denominata {@code giocatori} se questa non è piena (max 6 giocatori).
     *
     * @param giocatore istanza della classe {@code Giocatore}
     *
     * @return valore booleano {@code true} per inserimento riuscito, {@code false} in caso contrario.
     */
    public boolean aggiungiGiocatore(Giocatore giocatore){
        if(this.numeroGiocatori==6){
            return false;
        }

        giocatori.add(giocatore);
        this.numeroGiocatori++;

        return true;
    }

    /**
     * Ritorna l'oggetto {@code Giocatore} richiesto in input - Nota per la corretta interpretazione del codice: l'indice n-esimo restituisce l'indice n-1esimo (es. Giocatore 1 possiede indice 0).
     */
    public Giocatore getGiocatore(int index){
        return this.giocatori.get(index-1);
    }

    public int getNumeroGiocatori(){
        return this.numeroGiocatori;
    }

    public ArrayList<Giocatore> getGiocatori(){ return giocatori; }

    /**
     * Override del metodo toString(), stampa un elenco numerato dei giocatori.
     *
     * @return Stringa contenente un elenco numerato dei giocatori rappresentato nel seguente formato: <br>
     * 1. nomeGiocatore1<br>
     * 2. nomeGiocatore2
     */
    @Override
    public String toString(){
        
        String list = new String();
        int i = 1;
        for(Giocatore giocatore: giocatori){
            list += i + ". " + giocatore.getNome() + "\n";
            i++;
        }
        
        return list;
    }

    /**
     * Salva l'istanza della classe GestoreContratti in 'com.monopoly/savedcontent/GestoreGiocatori.sr'.
     *
     * @throws IOException nel caso di fallito salvataggio.
     */
    public void saveGestoreGiocatori() throws IOException{
    
        FileOutputStream fileOS = new FileOutputStream("src/main/java/com/monopoly/savedcontent/GestoreGiocatori.sr");
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
        
        objectOS.writeObject(this);
        
        fileOS.close();
        objectOS.close();
    }

    /**
     * Carica l'istanza della classe GestoreContratti in 'com.monopoly/savedcontent/GestoreGiocatori.sr'.
     *
     * @return In caso di file trovato e correttamente caricato: ultima istanza salvata di {@code gestoreContratti}.<br>
     * In caso di file non trovato: nuova istanza di {@code gestoreGiocatori}.<br>
     * In caso di IOException o ClassNotFoundException: {@code null}
     */
    public GestoreGiocatori loadGestoreGiocatori(){
    
        FileInputStream fileIS = null;
        ObjectInputStream objectIS = null;
        
        try{
            fileIS = new FileInputStream("src/main/java/com/monopoly/savedcontent/GestoreGiocatori.sr");
            objectIS = new ObjectInputStream(fileIS);

            GestoreGiocatori gestoreGiocatori = (GestoreGiocatori)objectIS.readObject();
            
            fileIS.close();
            objectIS.close();
            
            return gestoreGiocatori;
            
        }catch(FileNotFoundException e){
            return new GestoreGiocatori();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
        
    } 
    
}
