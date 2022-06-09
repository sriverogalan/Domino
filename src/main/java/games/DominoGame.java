package games;

import card.Card;
import card.Deck;
import lombok.Getter;
import player.Player;
import player.PlayerManager;

import java.util.ArrayList;
import java.util.List;

public class DominoGame {
    public boolean isWin = false;
    public Deck deck = new Deck();
    @Getter
    public List<Card> deckCards = deck.getCards();
    public List<Card> board = new ArrayList<>();

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
    public void reset() {
        isWin = false;
        PlayerManager.clearPlayers();
        board.clear();
        deckCards.clear();
        deck.createCards();
    }
}