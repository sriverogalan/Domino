package games.spanishGame;

import card.Card;
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
        chooseMode(); // CPU or Human
        game.startGame();
    }

    public static void chooseWhatYouWantToDo(Player player) {
        Text.chooseWhatYouWantToDo();
        switch (scanner.nextInt()) {
            case 1:
                playCard(player);
                break;
            case 2:
                takeCard(player);
                break;
            default:
                Text.wrongInput();
                chooseWhatYouWantToDo(player);
        }
    }

    public static void playCard(Player player) {
        Text.playCard();
        Card card = player.getHand().get(scanner.nextInt() - 1);
        Text.chooseLeftOrRight(card);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                game.playCardLeftBoard(card);
                break;
            }
            case 2: {
                game.playCardRightBoard(card);
                break;
            }
            default:
                Text.wrongInput();
                playCard(player);
        }
    } 
    public static void chooseMode() {
        Text.startSpanishGame();
        switch (scanner.nextInt()) {
            case 1 -> generatePlayers(1, false);
            case 2 -> generatePlayers(2, false);
            case 3 -> generatePlayers(3, false);
            case 4 -> generatePlayers(1, true);
            case 5 -> generatePlayers(2, true);
            case 6 -> generatePlayers(3, true);
            default -> {
                System.out.println("ERROR : Número no válido");
                chooseMode();
            }
        }
    }

    public static void generatePlayers(int numPlayers, boolean isCpu) {
        for (int i = 1; i <= numPlayers; i++) {
            if (isCpu) {
                PlayerManager.addPlayer(new Player("CPU " + i + 1, Colors.getRandomColor(), true));
            } else {
                Text.namePlayer(i + 1);
                PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor(), false));
            }
        }
    }
}