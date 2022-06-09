package card;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Card {
    private int x;
    private int y;
    public Card(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void rotate() {
        int temp = x;
        x = y;
        y = temp;
    }
    @Override
    public String toString() {
        return "[ " + x + " / " + y + " ]";
    }
}
