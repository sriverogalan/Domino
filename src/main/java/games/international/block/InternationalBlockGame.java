package games.international.block;

import games.DominoGame;
import games.international.draw.InternationalDrawMenu;
import player.Player;
import player.PlayerManager;
import utils.Text;

public class InternationalBlockGame extends DominoGame {

    public void start() {
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
