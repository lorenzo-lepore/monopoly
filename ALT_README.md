# Monopoly

Monopoly is a board game in which players compete to accumulate the most money and real estate. 
Players advance through the squares of the board using dices and depending on which square they land on, they can buy property, pay rent, 
build houses and hotels, pay taxes and receive prizes. The game ends when all but one player has declared bankruptcy, and the player left standing 
wins the game.

In this adapted version, written in Java language, the winning player is the one who has the most money at the end of the fifth round.

<figure>
  <img src="https://github.com/lorenzo-lepore/monopoly/assets/91348041/289cd0bc-3562-478c-a79c-bc58a840d11c">
  <figcaption><em>Main screen</em></figcaption>
</figure>
<br><br>

On the main screen you can start or resume a game.

In the first case, before clicking on 'New game', the main condition to guarantee the start of the game must be satisfied: a number of players equal to or greater than 2 (up to 6 players allowed) have to play. These can be added using the 'Add player' button, where it is possible to choose a nickname and a pawn among the available ones. It is possible to show the players through the 'Show players' button.

In the second case, by clicking on 'Resume game' the program will check for the presence of previously saved (unfinished) games in the system and will proceed to 
open the game board by restarting exactly from the last player's turn.

<figure>
  <img src="https://github.com/lorenzo-lepore/monopoly/assets/91348041/33a07645-7344-43fb-90fc-c55a7a9f4992">
  <figcaption><em>Game board</em></figcaption>
</figure>
<br><br>

The game takes place on the game board; in this, according to a randomly generated (at the beginning of the game) turn order, each player will be able to perform various actions, including:
<ul>
   <li>Viewing statistics</li>
   <li>Roll of the dices (mandatory to end the turn)</li>
   <li>Purchase of an available contract</li>
   <li>Paying of rent of a given real estate property of an opposing player</li>
   <li>Paying of a fee</li>
   <li>Passage on the 'Go!'</li>
   <li>Movement to prison</li>
   <li>End of turn</li>
</ul>

The square on which the player's pawn is located is highlighted in green. Each turn lasts 3 minutes; when the timer visible on the screen expires, the dice will be rolled automatically, and the current player's turn will end.<br>

<h2>Info</h2>

Windowed Mode: you can play in a window by simply moving the Monopoly window. This action is irreversible.

Documentation: you can view the Monopoly source code documentation in the 'JavaDoc' folder. The format of each file is HTML. Alternatively, feel free to consult the comments present in each class of the project.

Execution: to execute Monopoly you need to execute the 'Monopoly.java' class present in /monopoly/src/main/java/com.monopoly. 
To do this you need to have Java Development Kit (JDK) or Java Runtime Environment (JRE) installed on your system.
