package menu;

import games.colombianGame.ColombianGameMenu;
import games.mexicanGame.MexicanGameMenu;
import games.spanishGame.SpanishGameMenu;
import utils.Text;

import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void principal() {
        Text.principal();
        switch (scanner.nextInt()) {
            case 1 -> {
                SpanishGameMenu.main();
            }
            case 2 -> {
                MexicanGameMenu.main();
            }
            case 3 -> {
                ColombianGameMenu.main();
            }
        }

    }
}
