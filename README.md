# Monopoly

<b>Looking for the English version? Click <a href="https://github.com/lorenzo-lepore/monopoly/blob/main/ALT_README.md">here.</a></b>

Il Monopoly è un gioco da tavolo in cui i giocatori competono per accumulare la maggiore quantità di denaro e proprietà immobiliari. I giocatori avanzano attraverso le caselle del tabellone utilizzando dei dadi e, a seconda della casella su cui atterrano, possono acquistare proprietà, pagare affitti, costruire case e alberghi, pagare tasse e ricevere premi. Il gioco termina quando tutti i giocatori tranne uno si sono dichiarati bancarotta, e il giocatore rimasto in piedi vince il gioco.

In questa versione riadattata, scritta in linguaggio Java, il giocatore vincitore è colui che possiede più denaro allo scadere del quinto turno.

<figure>
  <img src="https://github.com/lorenzo-lepore/monopoly/assets/91348041/289cd0bc-3562-478c-a79c-bc58a840d11c">
  <figcaption><em>Schermata principale</em></figcaption>
</figure>
<br><br>

Nella schermata principale è possibile iniziare o riprendere una partita. 

Nel primo caso, prima di cliccare su 'Nuova partita' bisogna soddisfare la condizione principale per garantire il gioco: un numero di giocatori pari o superiore a 2 (fino a 6 giocatori consentiti). Questi possono essere aggiunti attraverso il pulsante 'Aggiungi giocatore' nel quale questi potranno inserire il proprio nickname e una pedina a scelta tra le disponibili. È possibile mostrare i giocatori attraverso il bottone 'Mostra giocatori'.

Nel secondo caso, al cliccare su 'Riprendi partita' il programma verificherà la presenza di partite precendentemente salvate (non concluse) nel sistema e procederà ad aprire il tabellone di gioco riprendendo esattamente dal turno dell'ultimo giocatore giocante.

<figure>
  <img src="https://github.com/lorenzo-lepore/monopoly/assets/91348041/33a07645-7344-43fb-90fc-c55a7a9f4992">
  <figcaption><em>Tabellone di gioco</em></figcaption>
</figure>
<br><br>

La partita si svolge nel tabellone di gioco; in questo, secondo un ordine dei turni generato casualmente all'inizio della partita, ogni giocatore avrà modo di compiere delle azioni, tra cui:
<ul>
  <li>Visualizzazione delle proprie statistiche</li>
  <li>Lancio dei dadi (obbligatorio per terminare il turno)</li>
  <li>Acquisto di un contratto disponibile a scelta</li>
  <li>Pagamento dell'affitto di una data proprietà immobiliare di un giocatore avversario</li>
  <li>Pagamento di una tassa</li>
  <li>Passaggio sul 'Via!'</li>
  <li>Spostamento in prigione</li>
  <li>Conclusione del turno</li>
</ul>

La casella sulla quale è presente la pedina del giocatore è evidenziata in verde. Ogni turno ha la durata di 3 minuti; allo scadere del timer visibile a schermo i dadi verranno lanciati automaticamente, e verrà concluso il turno del giocatore attuale.<br>

<h2>Info</h2>

Modalità in finestra: è possibile giocare in finestra semplicemente spostando l'applicazione di Monopoly. L'azione è irreversibile.

Documentazione: è possibile visualizzare la documentazione del codice sorgente di Monopoly nella cartella 'JavaDoc'. Il formato di ogni file è HTML. In 
alternativa, consulatare i commenti presenti in ciascuna classe del progetto.

Esecuzione: per eseguire Monopoly è necessario eseguire la classe 'Monopoly.java' presente in /monopoly/src/main/java/com.monopoly. Per fare ciò è necessario possedere il Java Development Kit (JDK) o il Java Runtime Environment (JRE) installato sul proprio sistema.











