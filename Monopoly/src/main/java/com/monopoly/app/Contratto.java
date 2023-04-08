package com.monopoly.app;

import java.io.Serializable;

/**
 * Classe rappresentante un contratto utilizzabile dal giocatore. Il contratto può essere acquistato ed usato per riscuotere
 * dai non possessori tariffe prestabilite quando essi passano sopra la corrispondente casella del tabellone.
 * Implementa l'interfaccia {@link Serializable} per salvare lo stato di ogni oggetto di tipo {@code Contratto} su file.
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
public class Contratto implements Serializable{

    private String nome;
    private int prezzoVendita;
    private int costoAffitto;
    private boolean disponibile;
    private Giocatore proprietario;

    /**
     * Istanzia un oggetto di tipo {@code Contratto}. Inizialmente il contratto è sempre disponibile, e non possiede proprietario.
     *
     * @param nome nome del contratto
     * @param prezzoVendita prezzo di vendita del contratto
     * @param costoAffitto costo di affitto del contratto
     * @param disponibile indica se un contratto è acquistabile o meno
     *
     */
    public Contratto(String nome, int prezzoVendita, int costoAffitto, boolean disponibile){
        this.nome = nome;
        this.prezzoVendita = prezzoVendita;
        this.costoAffitto = costoAffitto;
        this.disponibile = disponibile;
        this.proprietario = null;
    }

    public String getNome(){
        return nome;
    }

    public int getPrezzoVendita(){
        return prezzoVendita;
    }

    public int getCostoAffitto(){
        return costoAffitto;
    }

    public boolean getDisponibile(){
        return disponibile;
    }

    public Giocatore getProprietario(){
        return proprietario;
    }

    public void setProprietario(Giocatore proprietario){
        this.proprietario = proprietario;
    }

    public void setDisponibile(boolean disponibile){
        this.disponibile = disponibile;
    }

    public String toString(){
        return "- " + this.nome;
    }

}
