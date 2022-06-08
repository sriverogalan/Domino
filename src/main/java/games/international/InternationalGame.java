package games.international;

import card.*;
import lombok.Getter;
import player.Player;
import player.PlayerManager;
import utils.Text;

import java.util.*;

public class InternationalGame {
    public Deck deck = new Deck();
    @Getter
    public List<Card> deckCards = deck.getCards();
    public List<Card> board = new ArrayList<>();
    private final Random random = new Random();
    private boolean isWin = false;
    public void start() {
        PlayerManager.assignHandPlayer(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
                InternationalMenu.chooseWhatYouWantToDo(player);
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
            InternationalMenu.chooseWhatYouWantToDo(player);
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
                InternationalMenu.chooseWhatYouWantToDo(player);
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
                InternationalMenu.chooseWhatYouWantToDo(player);
            }
        }
    }
    public void printBoard() {
        for (Card card : board) {
            System.out.print(card);
        }
        System.out.println();
    }
}