package com.monopoly.app;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * Classe il cui scopo è gestire gli attributi di un giocatore del Monopoly. Fortemente interconnessa con gran parte delle classi, detiene, ed inoltre permette
 * di visualizzare o impostare: il nome del giocatore; la pedina da esso scelta; il suo stato (in prigione o "libero"); il denaro e i contratti a sua disposizione.
 * Implementa l'interfaccia {@link Serializable} per salvare lo stato di ogni oggetto di tipo {@code Giocatore} su file.
 *
 * @author Lorenzo Lepore - Matricola 172416
 * @version 1.0
 */
public class Giocatore implements Serializable{

    private String nome;
    private int denaro;
    private ArrayList<Contratto> contrattiPosseduti;
    private int numeroContrattiPosseduti;
    private boolean inPrigione;
    private Pedina pedinaPosseduta;

    /**
     * Istanzia un oggetto di tipo {@code Giocatore}; inizialmente, il giocatore non possiede nè denaro, nè contratti, e il suo stato
     * è necessariamente "libero" (non in prigione), per poter cominciare il gioco sulla prima casella del tabellone.
     *
     * @param nome nome del giocatore
     * @param pedina istanza della pedina scelta dal giocatore
     */
    public Giocatore(String nome, Pedina pedina){
        this.nome = nome;
        this.inPrigione = false;
        contrattiPosseduti = new ArrayList<Contratto>();
        this.denaro = 0;
        this.pedinaPosseduta = pedina;
    }
    
    public String getNome(){
        return nome;
    }

    public int getDenaro(){
        return denaro;
    }

    public List<Contratto> getContrattiPosseduti(){
        return contrattiPosseduti;
    }
    
    public String getStringContrattiPosseduti(){
    
        String contratti = new String();
        int i = 1;
        
        for(Contratto contratto : contrattiPosseduti){
            contratti += i + ") " + contratto.getNome() + "\n";
            i++;
        }
        
        return contratti;
    }
    
    public int getNumeroContrattiPosseduti(){
        return numeroContrattiPosseduti;
    }

    public boolean getInPrigione(){
        return inPrigione;
    }

    public Pedina getPedinaPosseduta(){
        return pedinaPosseduta;
    }
    
    public void setDenaro(int denaro) {
        this.denaro = denaro;
    }

    public void addDenaro (int denaro) {
        this.denaro += denaro;
    }

    public void setNumeroContrattiPosseduti(int numeroContratti){
        this.numeroContrattiPosseduti = numeroContratti;
    }

    public void addContrattiPosseduti(Contratto contratto){
        contrattiPosseduti.add(contratto);
    }

    public void setInPrigione(boolean inPrigione){
        this.inPrigione = inPrigione;
    }
    
}

