package games.international;

import card.Card;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

import java.util.*;

public class InternationalDrawMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final InternationalDrawGame game = new InternationalDrawGame();
    private static boolean isFirstPutBoard = true;
    public static void start() {
        Text.startInternationalGame();
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor()));
        choosePlayersMode();
        game.start();
    }
    public static void choosePlayersMode() {
        Text.chooseRivals();
        switch (scanner.nextInt()) {
            case 1 -> generatePlayers(1);
            case 2 -> generatePlayers(2);
            case 3 -> generatePlayers(3);
            default -> {
                Text.errorNumberNotValid();
                choosePlayersMode();
            }
        }
    }
    public static void generatePlayers(int numPlayers) {
        for (int i = 1; i <= numPlayers; i++) {
            Text.playerName(i + 1);
            PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor()));
        }
    }
    public static void chooseWhatYouWantToDo(Player player) {
        Text.separator();
        game.printBoard();
        player.displayHand();
        Text.chooseWhatYouWantToDo(player);
        switch (scanner.nextInt()) {
            case 1 -> playCard(player);
            case 2 -> {
                game.putCardToHand(player);
            }
            default -> {
                Text.wrongInput();
                chooseWhatYouWantToDo(player);
            }
        }
    }
    public static void playCard(Player player) {
        Text.playCard(player);
        Card card = player.getHand().get(scanner.nextInt()-1);
        if (isFirstPutBoard){
            game.firstPutBoard(player, card);
            isFirstPutBoard = false;
        } else {
            Text.chooseLeftOrRight(card);
            switch (scanner.nextInt()) {
                case 1 -> game.putCardLeft(player, card);
                case 2 -> game.putCardRight(player, card);
                default -> {
                    Text.wrongInput();
                    chooseWhatYouWantToDo(player);
                }
            }
        }
    }
}
