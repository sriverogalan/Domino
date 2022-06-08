package games.international.block;

import card.Card;
import games.DominoMenu;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;

public class InternationalBlockMenu extends DominoMenu {
    private static final InternationalBlockGame game = new InternationalBlockGame();

    public static void start() {
        Text.separator();
        Text.startInternationalBlockGame();
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor()));
        choosePlayersMode();
        game.start();
    }

    public static void chooseWhatYouWantToDo(Player player) {
        Text.separator();
        game.printBoard();
        player.displayHand();
        Text.chooseWhatYouWantToDoInternationalBlockGame(player);
        switch (scanner.nextInt()) {
            case 1 -> playCard(player);
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
