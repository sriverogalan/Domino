package player;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class PlayerManager {
    private static List<Player> players = new ArrayList<>();
    private static Random random = new Random();

    public static void addPlayer(Player player) {
        player.setId(players.size() + 1);
        players.add(player);
    }
    public static Player getPlayerById(int id) {
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }
    // metodo que empieze

    public static void resetPlayers() {
        for (Player player : players) {
            player.reset();
        }
    }


}