package games.international;

import card.*;
import player.Player;
import player.PlayerManager;

import java.util.*;

public class InternationalGame  {
    public Deck deck = new Deck();
    public List<Card> deckCards = deck.getCards();
    public List<Card> board = new ArrayList<>();
    private Random random = new Random();
    private boolean isWin = false;

    public void start() {
        PlayerManager.assignHandPlayer(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
                if (player.isBOT()) {
                    setRandomChoice(player);
                } else {
                    InternationalMenu.chooseWhatYouWantToDo(player);
                }
            }
        }
    }

    public void setRandomChoice(Player player) {
        int random = new Random().nextInt(board.size());
        player.setChoice(player.getHand);
    }
}
