package games.tapadito;
import card.Card;
import games.DominoMenu;
import player.Player;
import player.PlayerManager;
import utils.Colors;
import utils.Text;
public class TapaditoMenu extends DominoMenu {
    private static final TapaditoGame game = new TapaditoGame();
    private static boolean isFirstPutBoard = true;
    public static void start() {
        Text.separator();
        Text.startInternationalGame();
        PlayerManager.addPlayer(new Player(scanner.next(), Colors.getRandomColor()));
        choosePlayersMode();
        game.start();
    }
    public static void chooseWhatYouWantToDo(Player player) {
        Text.separator();
        game.printBoard();
        player.displayHandClosed();
        playCard(player);
    }
    public static void playCard(Player player) {
        Card card = chooseCard(player);
        if (isFirstPutBoard){
            game.firstPutBoard(player, card);
            isFirstPutBoard = false;
        } else {
            choosePlayCard(player,card);
        }
    }
    public static void choosePlayCard(Player player, Card card) {
        Text.chooseCardTapaditoOption(card);
        switch (scanner.nextInt()) {
            case 1 -> game.putCardLeft(player, card);
            case 2 -> game.putCardRight(player, card);
            case 3 -> Text.step(player);
            default -> {
                Text.wrongInput();
                choosePlayCard(player,card);
            }
        }
    }
}