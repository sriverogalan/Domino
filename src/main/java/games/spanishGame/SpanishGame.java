package games.spanishGame;

import card.Card;
import card.Deck;
import games.GameInterface;
import player.Player;
import player.PlayerManager;
import utils.Colors;

import java.util.*;

public class SpanishGame implements GameInterface {
    private Deck deck = new Deck();
    private List<Card> cards = deck.getCards();
    private Random random = new Random();

    @Override
    public void startGame( ) {

    }

    @Override
    public void endGame() {

    }

    @Override
    public void playGame() {

    }

    @Override
    public void displayGame() {

    }

    @Override
    public void displayGameResult() {

    }
}
