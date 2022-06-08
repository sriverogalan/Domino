package menu;


import games.international.InternationalDrawMenu;
import utils.*;

import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void start() {
        System.out.println("¡Bienvenido al juego de domino!");
        election();
    }

    public static void election(){
        Text.start();
        switch (scanner.nextInt()) {
            case 1 -> {
                InternationalDrawMenu.start();
            }
        }
        Text.doYouPlayAgain();
        election();
    }


}