package games;

import card.Card;
import card.Deck;
import games.international.InternationalDrawMenu;
import lombok.Getter;
import player.Player;
import player.PlayerManager;
import utils.Text;

import java.util.ArrayList;
import java.util.List;

public class DominoGame {
    private boolean isWin = false;
    public Deck deck = new Deck();
    @Getter
    public List<Card> deckCards = deck.getCards();
    public List<Card> board = new ArrayList<>();
    public void start() {
        PlayerManager.assignHandPlayer(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
                InternationalDrawMenu.chooseWhatYouWantToDo(player);
                if (player.isEmptyHand()) {
                    isWin = true;
                    Text.winner(player);
                    deck.createCards();
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
    public void firstPutBoard(Player player, Card card) {
        if (board.size() == 0) {
            board.add(card);
            player.getHand().remove(card);
        }
    }
    public void printBoard() {
        for (Card card : board) {
            System.out.print(card);
        }
        System.out.println();
        System.out.println();
    }

}
