package card;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Deck {
    public List<Card> cards = new ArrayList<>();
    public Deck() {
        createCards();
    }

    public void createCards() {
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j >= counter){
                    cards.add(new Card(i, j));
                }
            }
            counter++;
        }
        Collections.shuffle(cards);
    }

}