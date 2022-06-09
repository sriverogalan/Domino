package player;

import card.Card;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class PlayerManager {
    @Getter
    private static List<Player> players = new ArrayList<>();
    private static Random random = new Random();
    public static void addPlayer(Player player) {
        player.setId(players.size() + 1);
        players.add(player);
    }
    public static void assignHandPlayer(List<Card> cards) {
        for (Player player : players) {
            for (int i = 0; i < 7; i++) {
                player.addCard(cards.get(0));
                cards.remove(0);
            }
            System.out.println();
        }
    }

    public static void clearPlayers() {
        players.clear();
    }
}