package com.monopoly.app;

import java.io.Serializable;
import java.util.*;

/**
 * Classe impiegata nell'inizializzazione (in base al numero dei giocatori) della partita, attraverso l'assegnazione del denaro, dei contratti, e dell'ordine di gioco.
 *
 * @author Lorenzo Lepore - Matricola: 172416
 * @version 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class InizializzatorePartita implements Serializable {
    private final GestoreGiocatori gestoreGiocatori;
    private final GestoreContratti gestoreContratti;

    public InizializzatorePartita(GestoreGiocatori gestoreGiocatori, GestoreContratti gestoreContratti) {
        this.gestoreGiocatori = gestoreGiocatori;
        this.gestoreContratti = gestoreContratti;
    }

    /**
     *  Distribuisce equamente il denaro ai giocatori (in base al numero di questi) attraverso il metodo {@code setDenaro()} della classe {@code Giocatore}
     */
    public void AssegnazioneDenaro() {
        switch (gestoreGiocatori.getNumeroGiocatori()) {
            case 2 -> {
                for (Giocatore giocatore : gestoreGiocatori.getGiocatori()) {
                    giocatore.setDenaro(8750); }
            }
            case 3 -> {
                for (Giocatore giocatore : gestoreGiocatori.getGiocatori()) {
                    giocatore.setDenaro(7500);
                }
            }
            case 4 -> {
                for (Giocatore giocatore : gestoreGiocatori.getGiocatori()) {
                    giocatore.setDenaro(6250);
                }
            }
            case 5 -> {
                for (Giocatore giocatore : gestoreGiocatori.getGiocatori()) {
                    giocatore.setDenaro(5000);
                }
            }
            case 6 -> {
                for (Giocatore giocatore : gestoreGiocatori.getGiocatori()) {
                    giocatore.setDenaro(3750);
                }
            }
        }
    }

    public void initialize(int n) {
        for (Giocatore giocatore : gestoreGiocatori.getGiocatori()) {
            giocatore.setNumeroContrattiPosseduti(n);
            for (int i = 0; i < giocatore.getNumeroContrattiPosseduti(); i++) {
                int index;

                do {
                    index = (int) (Math.random() * gestoreContratti.getContratti().size());
                } while (!gestoreContratti.getContratti().get(index).getDisponibile());

                giocatore.addContrattiPosseduti(gestoreContratti.getContratti().get(index));
                gestoreContratti.getContratti().get(index).setProprietario(giocatore);
                giocatore.addDenaro(-gestoreContratti.getContratti().get(index).getPrezzoVendita());
                gestoreContratti.getContratti().get(index).setDisponibile(false);
            }
        }
    }

    /**
     *  Gestisce la distribuzione equa di contratti casuali, in base al numero dei giocatori. Una volta assegnato, il contratto diventa indisponibile, e il suo corrispettivo valore viene decurtato dal denaro disponibile del suo proprietario.
     */
    public void AssegnazioneContratti() {
        switch (gestoreGiocatori.getNumeroGiocatori()) {
            case 2 -> { initialize(7); }
            case 3 -> { initialize(6); }
            case 4 -> { initialize(5); }
            case 5 -> { initialize(4); }
            case 6 -> { initialize(3); }
        }
    }

    /**
     * Popola un array con i numeri assegnati a ciascun giocatore, succcessivamente esegue lo shuffle degli elementi.
     *
     * @return Array utile a gestire l'ordine con il quale i giocatori giocheranno i propri turni.
     */
    public Integer[] AssegnazioneOrdineGiocatori() {
        Integer[] ordine = new Integer[gestoreGiocatori.getNumeroGiocatori()];

        for (int i = 0; i < ordine.length; i++) {
            ordine[i] = i + 1;
        }

        List<Integer> ordineGiocatori = Arrays.asList(ordine);
        Collections.shuffle(ordineGiocatori);
        ordine = ordineGiocatori.toArray(ordine);

        return ordine;
    }
}
