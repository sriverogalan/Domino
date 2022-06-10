package games;

import card.Card;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

import java.util.Scanner;

public class DominoMenu {
    public static final Scanner scanner = new Scanner(System.in);

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

    public static Card chooseCard(Player player) {
        Text.playCard(player);
        int cardIndex = scanner.nextInt();
        if (cardIndex > player.getHand().size() || cardIndex < 1) {
            Text.errorNumberNotValid();
            chooseCard(player);
        }
        return player.getHand().get(cardIndex - 1);
    }

}
