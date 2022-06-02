package card;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Deck {
    private List<Card> cards = new ArrayList<>();
    public Deck() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                cards.add(new Card(i, j));
            }
        }
        Collections.shuffle(cards);
    }
}
