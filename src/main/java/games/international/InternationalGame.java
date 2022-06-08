package games.international;

import card.*;
import lombok.Getter;
import player.Player;
import player.PlayerManager;

import java.util.*;

public class InternationalGame  {
    public Deck deck = new Deck();
    @Getter public List<Card> deckCards = deck.getCards();
    public List<Card> board = new ArrayList<>();
    private Random random = new Random();
    private boolean isWin = false;

    public void start() {
        PlayerManager.assignHandPlayer(deckCards);
        while (!isWin) {
            for (Player player : PlayerManager.getPlayers()) {
                printBoard();
                if (player.isBOT()) {
                    setRandomChoice(player);
                } else {
                    player.displayHand();
                    InternationalMenu.chooseWhatYouWantToDo(player);
                }
                if (player.isEmptyHand()) {
                    isWin = true;
                    break;
                }
            }
        }
    }

    public void setRandomChoice(Player player) {
        int randomIndex = random.nextInt(player.getHand().size());
        Card card = player.getHand().get(randomIndex);

    }

    public void putCardToHand(Player player) {
        if ()
    }

    public void firstPutBoard(Player player, Card card) {
        if (board.size() == 0) {
            board.add(card);
            player.getHand().remove(card);
        }
    }
    public void putCardLeft(Player player, Card card) {
        if (card.getY() == board.get(0).getX()){
            board.add(0, card);
            player.getHand().remove(card);
        } else{
            card.rotate();
            if (card.getY() == board.get(0).getX()){
                board.add(0, card);
                player.getHand().remove(card);
            } else{
                System.out.println("ERROR : No se puede poner la carta");
                InternationalMenu.playCard(player);
            }
        }
    }
    public void putCardRight(Player player, Card card) {
        if (card.getX() == board.get(board.size()-1).getY()){
            board.add(card);
            player.getHand().remove(card);
        } else{
            card.rotate();
            if (card.getX() == board.get(board.size()-1).getY()){
                board.add(card);
                player.getHand().remove(card);
            } else{
                System.out.println("ERROR : No se puede poner la carta");
                InternationalMenu.playCard(player);
            }
        }
    }

    public void printBoard(){
        for (Card card : board) {
            System.out.print(card);
        }
        System.out.println();
    }







}
