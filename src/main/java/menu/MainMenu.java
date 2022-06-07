package menu;


import games.international.InternationalMenu;
import games.mexican.MexicanGameMenu;
import utils.*;

import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void principal() {
        Text.principal();
        switch (scanner.nextInt()) {
            case 1 -> {
                InternationalMenu.start();
            }
        }
    }
}