package games;

import games.all_games.ColombianGame;
import games.all_games.MexicanGame;
import games.all_games.SpanishGame;
import lombok.Getter;
import lombok.Setter;
import menu.MainMenu;

@Getter @Setter
public class GameLoader {

    private GameInterface gameInterface;

    public void load() {
        if (MainMenu.getGameType().equals("SPANISH")) {
            setGameInterface(new SpanishGame());
            getGameInterface().startGame();
        } if (MainMenu.getGameType().equals("COLOMBIAN")) {
            setGameInterface(new ColombianGame());
            getGameInterface().startGame();
        } if (MainMenu.getGameType().equals("MEXICAN")) {
            setGameInterface(new MexicanGame());
            getGameInterface().startGame();
        }
    }
}
