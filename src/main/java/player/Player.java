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
    private List<Card> playedCards = new ArrayList<>();
    private List<Card> discardedCards = new ArrayList<>();

    public Player(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String getInitial(){
        return name.substring(0,1);
    }

}