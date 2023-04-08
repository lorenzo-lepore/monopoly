/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monopoly.app;

import java.io.Serializable;

/**
 * Classe rappresentante una pedina utilizzabile dal giocatore.
 * Una pedina ha un nome, può essere scelta o meno da un giocatore, e, in caso di utilizzo in partita, possiede una posizione all'interno del tabellone di gioco.
 * Implementa l'interfaccia {@link Serializable} per salvare lo stato di ogni oggetto di tipo {@code Pedina} su file.
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
public class Pedina implements Serializable{
    
    private final String nome;
    private boolean isTaken;
    private int posizione;

    /**
     * Istanzia un oggetto di tipo {@code Pedina}; la pedina è disponibile ad essere scelta dal giocatore {@code this.isTaken = false} e
     * la sua posizione iniziale sul tabellone è 0 (non presente).
     *
     * @param nome nome della pedina
     */
    public Pedina(String nome){
        this.nome = nome;
        this.isTaken = false;
        this.posizione = 0;
    }    
    
    public void setIsTaken(boolean isTaken){
        this.isTaken = isTaken;
    }
    
    public void setPosizione(int posizione){
        this.posizione = posizione;
    } 
    
    public String getNome(){
        return nome;
    }
    
    public boolean getIsTaken(){
        return isTaken;
    }
    
    public int getPosizione(){
        return posizione;
    }
    
}
