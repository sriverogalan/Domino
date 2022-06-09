package games.international;

import card.Card;
import games.DominoGame;
import games.international.draw.InternationalDrawMenu;
import player.Player;

public class InternationalGame extends DominoGame {
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
                System.out.println("ERROR : No se puede poner la carta");
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
                System.out.println("ERROR : No se puede poner la carta");
                InternationalDrawMenu.chooseWhatYouWantToDo(player);
            }
        }
    }

}
