package games.spanishGame;

import card.Card;
import card.Deck;
import games.GameInterface;
import lombok.*;
import player.Player;
import player.PlayerManager;

import java.util.*;
@Getter @Setter
public class SpanishGame implements GameInterface {
    private Deck deck = new Deck();
    private List<Card> deckCards = deck.getCards();
    @Getter public List<Card> cardsPlayed = new ArrayList<>();
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
        if (cardsPlayed.size() == 0){
            cardsPlayed.add(card);
        } else {
            if (card.getY() == cardsPlayed.get(0).getX()) {
                cardsPlayed.add(0,card);
            } else {
                SpanishGameMenu.
            }
        }
    }

    @Override
    public void playCardRightBoard(Card card) {

    }
}
