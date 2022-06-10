package games.international_games.block;

import games.international_games.InternationalGame;
import player.Player;
import player.PlayerManager;
import utils.Text;

public class InternationalBlockGame extends InternationalGame {
    public void start() {
        PlayerManager.putTheNecessaryCardsInThePlayerHand(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()){
                InternationalBlockMenu.chooseWhatYouWantToDo(player);
                if (player.isEmptyHand()) {
                    isWin = true;
                    Text.winner(player);
                    reset();
                    break;
                }
            }
        }
    }
}
