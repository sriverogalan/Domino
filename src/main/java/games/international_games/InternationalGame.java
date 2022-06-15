package games.international_games;

import card.Card;
import games.DominoGame;
import games.international_games.draw.InternationalDrawMenu;
import player.Player;
import utils.Text;

public class InternationalGame extends DominoGame {
    public InternationalGame() {
        super();
    }
    public void putCardLeft(Player player, Card card) {
        if (card.getY() == board.get(0).getX()) {
            board.add(0, card);
            player.getHand().remove(card);
        } else {
            card.rotate();
            if (card.getY() == board.get(0).getX()) {
                board.add(0, card);
                player.getHand().remove(card);
            } else {
                Text.errorNotPutHere();
                InternationalDrawMenu.chooseWhatYouWantToDo(player);
            }
        }
    }
    public void putCardRight(Player player, Card card) {
        if (card.getX() == board.get(board.size() - 1).getY()) {
            board.add(card);
            player.getHand().remove(card);
        } else {
            card.rotate();
            if (card.getX() == board.get(board.size() - 1).getY()) {
                board.add(card);
                player.getHand().remove(card);
            } else {
                Text.errorNotPutHere();
                InternationalDrawMenu.chooseWhatYouWantToDo(player);
            }
        }
    }
}
