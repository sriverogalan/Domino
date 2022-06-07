package games.international;

import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

import java.util.*;

public class InternationalMenu {
    private static final Scanner scanner = new Scanner(System.in);   // Scanner to read user input
    private static final InternationalGame game = new InternationalGame();
    public static void start() {
        Text.startInternationalGame();
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor(), false));
        choosePlayersMode();
    }

    public static void choosePlayersMode() {
        Text.chooseRivals();
        switch (scanner.nextInt()) {
            case 1 -> generatePlayers(1, false);
            case 2 -> generatePlayers(2, false);
            case 3 -> generatePlayers(3, false);
            case 4 -> generatePlayers(1, true);
            case 5 -> generatePlayers(2, true);
            case 6 -> generatePlayers(3, true);
            default -> {
                System.out.println("ERROR : Número no válido");
                choosePlayersMode();
            }
        }
    }
    public static void generatePlayers(int numPlayers, boolean isCpu) {
        for (int i = 1; i <= numPlayers; i++) {
            if (isCpu) {
                PlayerManager.addPlayer(new Player("CPU " + (i+1), Colors.getRandomColor(), true));
            } else {
                Text.playerName(i + 1);
                PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor(), false));
            }
        }
    }

    public static void chooseWhatYouWantToDo(Player player) {

    }


}
