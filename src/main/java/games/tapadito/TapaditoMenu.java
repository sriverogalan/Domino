package games.tapadito;

import games.DominoMenu;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

public class TapaditoMenu extends DominoMenu {
    private static final TapaditoGame game = new TapaditoGame();
    public static void start() {
        Text.separator();
        Text.startInternationalGame();
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor()));
        choosePlayersMode();
        game.start();
    }/*
    public static void chooseWhatYouWantToDo(Player player) {
        Text.separator();
        game.printBoard();
        player.displayHandClosed();
        Text.chooseWhatYouWantToDoInternationalDrawGame(player);
        switch (scanner.nextInt()) {
            case 1 -> playCard(player);
            case 2 -> game.putCardToHand(player);
            default -> {
                Text.wrongInput();
                chooseWhatYouWantToDo(player);
            }
        }
    }
    public static void playCard(Player player) {
        Card card = chooseCard(player);
        if (isFirstPutBoard){
            game.firstPutBoard(player, card);
            isFirstPutBoard = false;
        } else {
            Text.chooseLeftOrRight(card);
            switch (scanner.nextInt()) {
                case 1 -> game.putCardLeft(player, card);
                case 2 -> game.putCardRight(player, card);
                case 3 -->
                default -> {
                    Text.wrongInput();
                    chooseWhatYouWantToDo(player);
                }
            }
        }
    }

    public static void chooseAgain(Player player) {
    }
*/

}