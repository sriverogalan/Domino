package games;

import card.Card;

public interface GameInterface {
    void startGame();
    void endGame();
    void playGame();
    void displayGame();
    void displayGameResult();
    void playCardLeftBoard(Card card);
    void playCardRightBoard(Card card);
}
