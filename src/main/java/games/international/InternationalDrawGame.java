package games.international;

import card.*;
import games.Game;
import lombok.Getter;
import player.Player;
import player.PlayerManager;
import utils.Text;

import java.util.*;

public class InternationalDrawGame extends Game {
    public Deck deck = new Deck();
    @Getter
    public List<Card> deckCards = deck.getCards();
    private boolean isWin = false;
    public void start() {
        PlayerManager.assignHandPlayer(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
                InternationalDrawMenu.chooseWhatYouWantToDo(player);
                if (player.isEmptyHand()) {
                    isWin = true;
                    Text.winner(player);
                    break;
                }
            }
        }
    }
    public void putCardToHand(Player player) {
        if (deckCards.size() > 0) {
            player.addCard(deckCards.get(0));
            deckCards.remove(0);
            InternationalDrawMenu.chooseWhatYouWantToDo(player);
        } else {
            System.out.println("No hay fichas para poder coger");
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