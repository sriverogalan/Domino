package player;
import card.Card;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Player {
    private String name;
    private String color;
    @Getter public List<Card> hand = new ArrayList<>();
    public Player(String name, String color ) {
        this.name = name;
        this.color = color;
    }
    public void addCard(Card card) {
        hand.add(card);
    }
    public boolean isEmptyHand() {
        return hand.isEmpty();
    }
    public void displayHand() {
        int counter = 1;
        for (Card card : hand) {
            System.out.print(counter++ + ". " + card.toString()+ " ");
            System.out.println();
        }
    }
    public void displayHandClosed(){
        int counter = 1;
        for (Card card : hand) {
            System.out.print(counter++ + ". [ ? / ? ] ");
            System.out.println();
        }
    }
    @Override
    public String toString() {
        return "Player " + name + " ";
    }
}