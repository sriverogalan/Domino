package games.tapadito;

import card.Card;
import games.DominoMenu;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

public class InternationalBlockMenu extends DominoMenu {

    private static final InternationalBlockGame game = new InternationalBlockGame();

    public static void start() {
        Text.startInternationalBlockGame();
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor()));
        choosePlayersMode();

    }

    public static void chooseWhatYouWantToDo(Player player) {
        Text.separator();
        game.printBoard();
        player.displayHand();
        Text.chooseWhatYouWantToDoInternationalDrawGame(player);
        switch (scanner.nextInt()) {

            default -> {
                Text.wrongInput();
                chooseWhatYouWantToDo(player);
            }
        }
    }


}
