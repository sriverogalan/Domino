package games.international;

import games.DominoGame;
import player.Player;
import player.PlayerManager;
import utils.Text;

public class InternationalDrawGame extends DominoGame {
    public void putCardToHand(Player player) {
        if (deckCards.size() > 0) {
            player.addCard(deckCards.get(0));
            deckCards.remove(0);
            InternationalDrawMenu.chooseWhatYouWantToDo(player);
        } else {
            System.out.println("No hay fichas para poder coger");
        }
    }
}