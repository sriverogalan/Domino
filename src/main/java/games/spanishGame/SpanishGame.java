package games.spanishGame;

import card.Card;
import card.Deck;
import games.GameInterface;
import player.Player;
import player.PlayerManager;

import java.util.*;

public class SpanishGame implements GameInterface {
    private Deck deck = new Deck();
    private List<Card> deckCards = deck.getCards();
    private List<Card> cardsPlayed = new ArrayList<>();
    private Random random = new Random();
    private boolean isWin = false;

    @Override
    public void startGame() {
        PlayerManager.assignHandPlayer(deckCards);  // Assign cards to players
        while(!isWin){
            for (Player player : PlayerManager.getPlayers()) {
                if (player.isCPU()) {

                } else {
                    displayGame();
                    player.displayHand();
                    SpanishGameMenu.chooseWhatYouWantToDo(player);

                }
                if (player.isEmptyHand()){
                    isWin = true;
                    break;
                }
            }
        }
        endGame();
    }

    @Override
    public void endGame() {
        System.out.println("Game ended");
    }

    @Override
    public void playGame() {

    }


    @Override
    public void displayGame() {
        for (int i = 0; i < cardsPlayed.size(); i++) {
            System.out.print(cardsPlayed.get(i));
        }
    }
    @Override
    public void displayGameResult() {

    }

    @Override
    public void playCardLeftBoard(Card card) {
        cardsPlayed.add(0,card);
    }

    @Override
    public void playCardRightBoard(Card card) {

    }
}
