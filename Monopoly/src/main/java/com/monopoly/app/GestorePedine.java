/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monopoly.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Classe adoperata alla gestione delle pedine.
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class GestorePedine implements Serializable {
    public static final long serialVersionUID = 1L;
    private static final GestorePedine instance = new GestorePedine();
    private final HashMap<String,Pedina> pedine;

    private GestorePedine() {
        pedine = new HashMap<>();
        
        pedine.put("Cane",new Pedina("Cane"));
        pedine.put("Cilindro",new Pedina("Cilindro"));
        pedine.put("Carriola",new Pedina("Carriola"));
        pedine.put("Macchina",new Pedina("Macchina"));
        pedine.put("Nave",new Pedina("Nave"));
        pedine.put("Stivale",new Pedina("Stivale"));
    }

    public static GestorePedine getInstance() {
        return instance;
    }
        
    public HashMap<String,Pedina> getPedine() {
        return pedine;
    }

    /**
     * Salva l'istanza della classe GestorePedine in 'com.monopoly/savedcontent/GestorePedine.sr'.
     *
     * @throws IOException nel caso di fallito salvataggio.
     */
    public void saveGestorePedine() throws IOException {
        FileOutputStream fileOS = new FileOutputStream("src/main/java/com/monopoly/savedcontent/GestorePedine.sr");
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
    
        objectOS.writeObject(this);
        
        fileOS.close();
        objectOS.close();
    }

    /**
     * Carica l'istanza della classe GestorePedine in 'com.monopoly/savedcontent/GestorePedine.sr'.
     *
     * @return In caso di file trovato e correttamente caricato: ultima istanza salvata di {@code gestorePedine}.<br>
     * In caso di file non trovato: nuova istanza di {@code gestorePedine}.<br>
     * In caso di IOException o ClassNotFoundException: {@code null}
     */
    public static GestorePedine loadGestorePedine() {
        FileInputStream fileIS;
        ObjectInputStream objectIS;
        GestorePedine gestorePedine;

        try {
            fileIS = new FileInputStream("src/main/java/com/monopoly/savedcontent/GestorePedine.sr");
            objectIS = new ObjectInputStream(fileIS);
            
            gestorePedine = (GestorePedine)objectIS.readObject();

            fileIS.close();
            objectIS.close();

            return gestorePedine;
        }catch(FileNotFoundException e){
            return new GestorePedine();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
