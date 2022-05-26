import games.GameLoader;
import lombok.Getter;
import menu.MainMenu;

public class Domino {
    @Getter private static GameLoader gameLoader;
    @Getter private static MainMenu mainMenu;

    public static void main(String[] args) {
        mainMenu = new MainMenu();
        gameLoader = new GameLoader();
        mainMenu.principal();
        gameLoader.load();
    }
}