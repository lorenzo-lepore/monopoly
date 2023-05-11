/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.monopoly.gui.panels;

import com.monopoly.app.Contratto;
import com.monopoly.app.GestoreContratti;
import com.monopoly.app.GestoreGiocatori;
import com.monopoly.app.GestorePartita;
import com.monopoly.app.GestorePedine;
import com.monopoly.app.Giocatore;
import com.monopoly.gui.frames.PayFrame;
import java.awt.Color;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Lorenzo Lepore - Matricola: 172416
 */
@SuppressWarnings("SpellCheckingInspection")
public class GameboardPanel extends javax.swing.JPanel{
    private final JFrame actualFrame;
    private final Giocatore giocatoreAttuale;
    private final GestoreGiocatori gestoreGiocatori;
    private final GestoreContratti gestoreContratti;
    private final GestorePedine gestorePedine;
    private final GestorePartita gestorePartita;
    private final HashMap<Integer, JButton> caselle;
    private boolean rolledDices = false;

    /**
     * @param givenFrame  
     * @param gestoreGiocatori  
     * @param gestoreContratti  
     * @param gestorePedine  
     * @param gestorePartita  
     */
    public GameboardPanel(
            JFrame givenFrame, 
            GestoreGiocatori gestoreGiocatori, 
            GestoreContratti gestoreContratti, 
            GestorePedine gestorePedine, 
            GestorePartita gestorePartita
            ) {
        initComponents();
        
        this.actualFrame = givenFrame;
        this.gestoreGiocatori = gestoreGiocatori;
        this.gestoreContratti = gestoreContratti;
        this.gestorePedine = gestorePedine;
        this.gestorePartita = gestorePartita;
        
        this.giocatoreAttuale = this.gestoreGiocatori.getGiocatore(this.gestorePartita.getOrdineGiocatori()[this.gestorePartita.getOrdineGiocatoriIndex()]);
        
        caselle = new HashMap<>();
        
        caselle.put(0, viaButton);
        caselle.put(1, vicoloCortoButton);
        caselle.put(2, vicoloStrettoButton);
        caselle.put(3, societaAcquaPotabileButton);
        caselle.put(4, stazioneSudButton);
        caselle.put(5, bastioniGranSassoButton);
        caselle.put(6, vialeMonterosaButton);
        caselle.put(7, vialeVesuvioButton);
        caselle.put(8, prigioneButton);
        caselle.put(9, viaAccademiaButton);
        caselle.put(10, corsoAteneoButton);
        caselle.put(11, piazzaUniversitaButton);
        caselle.put(12, stazioneOvestButton);
        caselle.put(13, viaVerdiButton);
        caselle.put(14, corsoRaffaelloButton);
        caselle.put(15, piazzaDanteButton);
        caselle.put(16, parcheggioButton);
        caselle.put(17, viaMarcoPoloButton);
        caselle.put(18, corsoMagellanoButton);
        caselle.put(19, largoColomboButton);
        caselle.put(20, stazioneNordButton);
        caselle.put(21, vialeCostantinoButton);
        caselle.put(22, vialeTraianoButton);
        caselle.put(23, piazzaGiulioCesareButton);
        caselle.put(24, inPrigioneButton);
        caselle.put(25, viaRomaButton);
        caselle.put(26, corsoImperoButton);
        caselle.put(27, largoAugustoButton);
        caselle.put(28, stazioneEstButton);
        caselle.put(29, societaElettricaButton);
        caselle.put(30, vialeDeiGiardiniButton);
        caselle.put(31, parcoDellaVittoriaButton);

        startTimer();
        updateInfoTextArea();
        
        caselle.get(this.giocatoreAttuale.getPedinaPosseduta().getPosizione()).setBackground(Color.green);
        
        this.terminaTurnoButton.addActionListener(
               actionEvent -> {
                    handleTerminaTurno();
                }
        );
        
        this.acquistaContrattoButton.addActionListener(
                actionEvent -> {
                    handleAcquistaContratto();
                }
        );
        
        this.pagaAffittoButton.addActionListener(
                actionEvent -> {
                    handlePagaAffitto();
                }
        );
        
        this.pagaTassaButton.addActionListener(
                actionEvent -> handlePagaTassa()
        );
        
        this.passaDalViaButton.addActionListener(
                actionEvent -> handlePassaDalVia()
        );
        
        this.vaiInPrigioneButton.addActionListener(
                actionEvent -> handleVaiInPrigione()
        );
        
        this.lanciaDadiButton.addActionListener(
                actionEvent -> handleRollDices()
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parcheggioButton = new javax.swing.JButton();
        piazzaDanteButton = new javax.swing.JButton();
        corsoRaffaelloButton = new javax.swing.JButton();
        viaVerdiButton = new javax.swing.JButton();
        stazioneOvestButton = new javax.swing.JButton();
        piazzaUniversitaButton = new javax.swing.JButton();
        corsoAteneoButton = new javax.swing.JButton();
        viaAccademiaButton = new javax.swing.JButton();
        prigioneButton = new javax.swing.JButton();
        viaMarcoPoloButton = new javax.swing.JButton();
        vialeVesuvioButton = new javax.swing.JButton();
        vialeMonterosaButton = new javax.swing.JButton();
        bastioniGranSassoButton = new javax.swing.JButton();
        corsoMagellanoButton = new javax.swing.JButton();
        largoColomboButton = new javax.swing.JButton();
        stazioneNordButton = new javax.swing.JButton();
        stazioneSudButton = new javax.swing.JButton();
        societaAcquaPotabileButton = new javax.swing.JButton();
        vicoloStrettoButton = new javax.swing.JButton();
        vicoloCortoButton = new javax.swing.JButton();
        viaButton = new javax.swing.JButton();
        vialeCostantinoButton = new javax.swing.JButton();
        vialeTraianoButton = new javax.swing.JButton();
        piazzaGiulioCesareButton = new javax.swing.JButton();
        inPrigioneButton = new javax.swing.JButton();
        viaRomaButton = new javax.swing.JButton();
        corsoImperoButton = new javax.swing.JButton();
        largoAugustoButton = new javax.swing.JButton();
        stazioneEstButton = new javax.swing.JButton();
        societaElettricaButton = new javax.swing.JButton();
        vialeDeiGiardiniButton = new javax.swing.JButton();
        parcoDellaVittoriaButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lanciaDadiButton = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        acquistaContrattoButton = new javax.swing.JButton();
        pagaTassaButton = new javax.swing.JButton();
        vaiInPrigioneButton = new javax.swing.JButton();
        pagaAffittoButton = new javax.swing.JButton();
        passaDalViaButton = new javax.swing.JButton();
        terminaTurnoButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setEnabled(false);

        parcheggioButton.setText("Parcheggio");

        piazzaDanteButton.setText("Piazza Dante");

        corsoRaffaelloButton.setText("Corso Raffaello");

        viaVerdiButton.setText("Via Verdi");

        stazioneOvestButton.setText("Stazione Ovest");

        piazzaUniversitaButton.setText("Piazza Università");

        corsoAteneoButton.setText("Corso Ateneo");

        viaAccademiaButton.setText("Via Accademia");

        prigioneButton.setText("Prigione");

        viaMarcoPoloButton.setText("Via Marco Polo");

        vialeVesuvioButton.setText("Viale Vesuvio");

        vialeMonterosaButton.setText("Viale Monterosa");

        bastioniGranSassoButton.setText("Bastioni G. Sasso");

        corsoMagellanoButton.setText("Corso Magellano");

        largoColomboButton.setText("Largo Colombo");

        stazioneNordButton.setText("Stazione Nord");

        stazioneSudButton.setText("Stazione Sud");

        societaAcquaPotabileButton.setText("Società acqua pot.");

        vicoloStrettoButton.setText("Vicolo Stretto");

        vicoloCortoButton.setText("Vicolo Corto");

        viaButton.setText("<-- Via");

        vialeCostantinoButton.setText("Viale Costantino");

        vialeTraianoButton.setText("Viale Traiano");

        piazzaGiulioCesareButton.setText("Piazza G. Cesare");

        inPrigioneButton.setText("In Prigione!");

        viaRomaButton.setText("Via Roma");

        corsoImperoButton.setText("Corso Impero");

        largoAugustoButton.setText("Largo Augusto");

        stazioneEstButton.setText("Stazione Est");

        societaElettricaButton.setText("Società elettrica");

        vialeDeiGiardiniButton.setText("Viale dei Giardini");

        parcoDellaVittoriaButton.setText("Parco della Vittoria");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/label.png"))); // NOI18N

        lanciaDadiButton.setText("Lancia dadi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lanciaDadiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lanciaDadiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(null);

        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        infoTextArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(infoTextArea);

        acquistaContrattoButton.setText("Acquista contratto");

        pagaTassaButton.setText("Paga tassa");

        vaiInPrigioneButton.setText("Vai in prigione");

        pagaAffittoButton.setText("Paga affitto");

        passaDalViaButton.setText("Passa dal via");

        terminaTurnoButton.setText("Termina turno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(parcheggioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viaMarcoPoloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(corsoMagellanoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(largoColomboButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stazioneNordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vialeCostantinoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vialeTraianoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(piazzaGiulioCesareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viaAccademiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viaVerdiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stazioneOvestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(piazzaUniversitaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(corsoAteneoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(piazzaDanteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(corsoRaffaelloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parcoDellaVittoriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(societaElettricaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vialeDeiGiardiniButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stazioneEstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(largoAugustoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corsoImperoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viaRomaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inPrigioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prigioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vialeVesuvioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vialeMonterosaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bastioniGranSassoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stazioneSudButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(societaAcquaPotabileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vicoloStrettoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vicoloCortoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(vaiInPrigioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(terminaTurnoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pagaTassaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passaDalViaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(acquistaContrattoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pagaAffittoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parcheggioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viaMarcoPoloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corsoMagellanoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largoColomboButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stazioneNordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vialeCostantinoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vialeTraianoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(piazzaGiulioCesareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inPrigioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(piazzaDanteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viaRomaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corsoRaffaelloButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corsoImperoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viaVerdiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(largoAugustoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stazioneOvestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stazioneEstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(piazzaUniversitaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(societaElettricaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corsoAteneoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vialeDeiGiardiniButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viaAccademiaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(parcoDellaVittoriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prigioneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vialeVesuvioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vialeMonterosaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bastioniGranSassoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stazioneSudButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(societaAcquaPotabileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vicoloStrettoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vicoloCortoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acquistaContrattoButton)
                            .addComponent(pagaAffittoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pagaTassaButton)
                            .addComponent(passaDalViaButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vaiInPrigioneButton)
                            .addComponent(terminaTurnoButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acquistaContrattoButton;
    private javax.swing.JButton bastioniGranSassoButton;
    private javax.swing.JButton corsoAteneoButton;
    private javax.swing.JButton corsoImperoButton;
    private javax.swing.JButton corsoMagellanoButton;
    private javax.swing.JButton corsoRaffaelloButton;
    private javax.swing.JButton inPrigioneButton;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lanciaDadiButton;
    private javax.swing.JButton largoAugustoButton;
    private javax.swing.JButton largoColomboButton;
    private javax.swing.JButton pagaAffittoButton;
    private javax.swing.JButton pagaTassaButton;
    private javax.swing.JButton parcheggioButton;
    private javax.swing.JButton parcoDellaVittoriaButton;
    private javax.swing.JButton passaDalViaButton;
    private javax.swing.JButton piazzaDanteButton;
    private javax.swing.JButton piazzaGiulioCesareButton;
    private javax.swing.JButton piazzaUniversitaButton;
    private javax.swing.JButton prigioneButton;
    private javax.swing.JButton societaAcquaPotabileButton;
    private javax.swing.JButton societaElettricaButton;
    private javax.swing.JButton stazioneEstButton;
    private javax.swing.JButton stazioneNordButton;
    private javax.swing.JButton stazioneOvestButton;
    private javax.swing.JButton stazioneSudButton;
    private javax.swing.JButton terminaTurnoButton;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JButton vaiInPrigioneButton;
    private javax.swing.JButton viaAccademiaButton;
    private javax.swing.JButton viaButton;
    private javax.swing.JButton viaMarcoPoloButton;
    private javax.swing.JButton viaRomaButton;
    private javax.swing.JButton viaVerdiButton;
    private javax.swing.JButton vialeCostantinoButton;
    private javax.swing.JButton vialeDeiGiardiniButton;
    private javax.swing.JButton vialeMonterosaButton;
    private javax.swing.JButton vialeTraianoButton;
    private javax.swing.JButton vialeVesuvioButton;
    private javax.swing.JButton vicoloCortoButton;
    private javax.swing.JButton vicoloStrettoButton;
    // End of variables declaration//GEN-END:variables

    public void handleRollDices() {
        Random randomNumber = new Random();
        int dice1 = randomNumber.nextInt(6) + 1;
        int dice2 = randomNumber.nextInt(6) + 1;

        int result = dice1 + dice2;
        
        JOptionPane.showMessageDialog(
                    this.getParent(),
                    "Risultato dado 1: " + dice1 + "\nRisultato dado 2: " + dice2 + "\n\nSpostamento di " + result + " caselle.",
                    "Dadi lanciati",
                    JOptionPane.INFORMATION_MESSAGE
        );
        
        caselle.get(this.giocatoreAttuale.getPedinaPosseduta().getPosizione()).setBackground(new JButton().getBackground());

        this.giocatoreAttuale.getPedinaPosseduta().setPosizione(this.giocatoreAttuale.getPedinaPosseduta().getPosizione() + result);
        
        if (this.giocatoreAttuale.getPedinaPosseduta().getPosizione() > 31) {
            this.giocatoreAttuale.getPedinaPosseduta().setPosizione(this.giocatoreAttuale.getPedinaPosseduta().getPosizione() - 32);
            this.giocatoreAttuale.setDenaro(this.giocatoreAttuale.getDenaro() + 500);
            JOptionPane.showMessageDialog(
                    this.getParent(),
                    "Sei passato dal via. Ottieni 500$",
                    "Informazione",
                    JOptionPane.INFORMATION_MESSAGE
            );
            updateInfoTextArea();
        }
        
        caselle.get(this.giocatoreAttuale.getPedinaPosseduta().getPosizione()).setBackground(Color.green);
        
        if (this.giocatoreAttuale.getPedinaPosseduta().getPosizione() == 24) {
            this.giocatoreAttuale.getPedinaPosseduta().setPosizione(8);
            handleVaiInPrigione();
        }
        
        lanciaDadiButton.setEnabled(false);
        rolledDices = true;
    }
    
    public void updateInfoTextArea() {
        infoTextArea.setText("Turno di " + giocatoreAttuale.getNome() + "\nPedina: " + giocatoreAttuale.getPedinaPosseduta().getNome()
                    + "\nDenaro: " + giocatoreAttuale.getDenaro() + " $\n\nContratti posseduti:\n" + giocatoreAttuale.getStringContrattiPosseduti());
        infoTextArea.setCaretPosition(0);
    }    

    private void handleTerminaTurno() {
        if (!rolledDices) {
            JOptionPane.showMessageDialog(
                    this.getParent(),
                    "Per terminare il turno è necessario lanciare i dadi",
                    "Impossibile terminare il turno",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        this.gestorePartita.setOrdineGiocatoriIndex(this.gestorePartita.getOrdineGiocatoriIndex() + 1);

        if (this.gestorePartita.getOrdineGiocatoriIndex() == this.gestoreGiocatori.getNumeroGiocatori()) {
            
            this.gestorePartita.setGiri(this.gestorePartita.getGiri() + 1);
            this.gestorePartita.setOrdineGiocatoriIndex(0);
        }
        
        if (this.gestorePartita.getGiri() == 5) {
            String giocatoreVincitore = new String();
            int denaroVincitore = 0;

            for (Giocatore giocatore : this.gestoreGiocatori.getGiocatori()) {
                for(Contratto contratto: giocatore.getContrattiPosseduti()) {
                    giocatore.addDenaro(contratto.getPrezzoVendita());
                }
            }

            for (Giocatore giocatore : this.gestoreGiocatori.getGiocatori()) {
                if(giocatore.getDenaro() > denaroVincitore) {
                    denaroVincitore = giocatore.getDenaro();
                    giocatoreVincitore = giocatore.getNome();
                }
            }

            JOptionPane.showMessageDialog(
                    this.getParent(),
                    "VINCE " + giocatoreVincitore + "!",
                    "Partita terminata",
                    JOptionPane.INFORMATION_MESSAGE
            );

            System.exit(0);
        }

        if (this.gestoreGiocatori.getGiocatore(this.gestorePartita.getOrdineGiocatori()[this.gestorePartita.getOrdineGiocatoriIndex()]).getInPrigione()) {
            this.setVisible(false);
            PrisonPanel newPrisonPanel = new PrisonPanel(
                    this.actualFrame,
                    this.gestoreGiocatori,
                    this.gestoreContratti,
                    this.gestorePedine,
                    this.gestorePartita
            );
            this.actualFrame.setContentPane(newPrisonPanel);        
        } else if (!this.gestoreGiocatori.getGiocatore(this.gestorePartita.getOrdineGiocatori()[this.gestorePartita.getOrdineGiocatoriIndex()]).getInPrigione()) {
            this.setVisible(false);
            GameboardPanel newGameboardPanel = new GameboardPanel(
                    this.actualFrame,
                    this.gestoreGiocatori,
                    this.gestoreContratti,
                    this.gestorePedine,
                    this.gestorePartita
            );
            this.actualFrame.setContentPane(newGameboardPanel);
        }

        try {
            saveStateOfTheGame();
        } catch (IOException ex) {
            Logger.getLogger(GameboardPanel.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    private void handleAcquistaContratto() {
        PayFrame payFrame = new PayFrame(1,this.gestoreContratti,this.giocatoreAttuale,this);
        payFrame.setVisible(true);
    }

    private void handlePagaAffitto() {
        PayFrame payFrame = new PayFrame(2,this.gestoreContratti,this.giocatoreAttuale,this);
        payFrame.setVisible(true);
    }

    private void handlePagaTassa() {
        PayFrame payFrame = new PayFrame(3,this.gestoreContratti,this.giocatoreAttuale,this);
        payFrame.setVisible(true);
    }

    private void handlePassaDalVia() {
        this.giocatoreAttuale.addDenaro(500);

        JOptionPane.showMessageDialog(
                this.getParent(), 
                "Hai ottenuto 500€. ",
                "Passa dal via",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        caselle.get(this.giocatoreAttuale.getPedinaPosseduta().getPosizione()).setBackground(new JButton().getBackground());
        this.giocatoreAttuale.getPedinaPosseduta().setPosizione(0);
        caselle.get(this.giocatoreAttuale.getPedinaPosseduta().getPosizione()).setBackground(Color.green);
        
        updateInfoTextArea();
    }

    private void handleVaiInPrigione() {
        JOptionPane.showMessageDialog(
                this.getParent(),
                "Dal prossimo turno sarai in prigione.",
                "Vai in prigione",
                JOptionPane.INFORMATION_MESSAGE
        );

        this.giocatoreAttuale.setInPrigione(true);
    }

    public void startTimer() {
        Thread t = new Thread(() -> {
            int i;

            for (i = 5; i >= 0; i--) {
                try {
                    timerLabel.setText("Secondi a disposizione prima della fine del turno: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {}
            }

            if (i < 0) {
                handleRollDices();
                handleTerminaTurno();
            }
        });
        t.start();
    }

    private void saveStateOfTheGame() throws IOException{
        this.gestoreGiocatori.saveGestoreGiocatori();
        this.gestoreContratti.saveGestoreContratti();
        this.gestorePedine.saveGestorePedine();
        this.gestorePartita.saveGestorePartita();
    }
}
