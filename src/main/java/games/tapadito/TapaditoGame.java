package games.tapadito;

import card.Card;
import games.DominoGame;
import player.Player;
import player.PlayerManager;
import utils.Text;

public class TapaditoGame extends DominoGame {
    public void start() {
        PlayerManager.assignHandPlayerDraw(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
               //  TapaditoMenu.chooseWhatYouWantToDo(player);
                if (player.isEmptyHand()) {
                    isWin = true;
                    Text.winner(player);
                    reset();
                    break;
                }
            }
        }
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
                System.out.println("ERROR : No se puede poner la carta");
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
            }
        }
    }


}
