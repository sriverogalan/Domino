package games.spanishGame;

import games.GameInterface;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

import java.util.*;

public class SpanishGameMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GameInterface game = new SpanishGame();
    public static void play() {
        Text.namePlayer(1);
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor(), false));
        chooseMode();

    }
    public static void chooseMode(){
        Text.startSpanishGame();
        switch (scanner.nextInt()) {
            case 1 ->  generatePlayers(1, false);
            case 2 ->  generatePlayers(2, false);
            case 3 ->  generatePlayers(3, false);
            case 4 ->  generatePlayers(1, true);
            case 5 ->  generatePlayers(2, true);
            case 6 ->  generatePlayers(3, true);
            default ->{System.out.println("ERROR : Número no válido"); chooseMode();}
        }
    }
    public static void generatePlayers(int numPlayers, boolean isCpu) {
        for (int i = 1; i <= numPlayers; i++) {
            Text.namePlayer(i);
            if (isCpu){
                PlayerManager.addPlayer(new Player("CPU " + i , Colors.getRandomColor(), true));
            } else {
                PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor(), false));
            }
        }
    }



}
