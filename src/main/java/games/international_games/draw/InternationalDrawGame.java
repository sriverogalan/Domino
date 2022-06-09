package games.international_games.draw;

import games.international_games.InternationalGame;
import player.Player;
import player.PlayerManager;
import utils.Text;

public class InternationalDrawGame extends InternationalGame {
    public void start() {
        PlayerManager.assignHandPlayerDraw(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
                InternationalDrawMenu.chooseWhatYouWantToDo(player);
                if (player.isEmptyHand()) {
                    isWin = true;
                    Text.winner(player);
                    reset();
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

}