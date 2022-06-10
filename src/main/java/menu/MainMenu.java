package menu;


import games.international_games.draw.InternationalDrawMenu;
import games.international_games.block.InternationalBlockMenu;
import games.tapadito.TapaditoMenu;
import utils.*;

import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        Text.startDomino();
        election();
    }

    public static void election() {
        Text.separator();
        Text.start();
        switch (scanner.nextInt()) {
            case 1 -> InternationalDrawMenu.start();
            case 2 -> InternationalBlockMenu.start();
            case 3 -> TapaditoMenu.start();
            default -> {
                Text.errorNumberNotValid();
                election();
            }
        }
        playAgain();
    }
    public static void playAgain() {
        Text.doYouPlayAgain();
        switch (scanner.nextInt()) {
            case 1 -> election();
            case 2 -> System.exit(0);
            default -> {
                Text.errorNumberNotValid();
                election();
            }
        }
    }

}