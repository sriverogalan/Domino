package player;
import card.Card;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Player {
    private int id;
    private String name;
    private String color;
    private List<Card> hand = new ArrayList<>();
    private int points = 0;
    private int turn;
    private boolean isCPU;

    public Player(String name, String color, boolean isCPU) {
        this.name = name;
        this.color = color;
        this.isCPU = isCPU;
    }

    public void addCard(Card card) {
        hand.add(card);
    }
    public void removeCard(Card card) {
        hand.remove(card);
    }
    public void addPoints(int points) {
        this.points += points;
    }
    public void removePoints(int points) {
        this.points -= points;
    }
    public void resetPoints() {
        this.points = 0;
    }
    public void resetHand() {
        hand.clear();
    }

    public void reset() {
        resetPoints();
        resetHand();
    }

    public String getInitial(){
        return name.substring(0,1);
    }

}