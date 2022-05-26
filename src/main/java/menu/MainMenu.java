package menu;

import games.GameLoader;
import lombok.Getter;
import utils.Text;

import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    @Getter private static String gameType;

    public void principal() {
        Text.textPrincipal();
        switch (scanner.nextInt()) {
            case 1 -> {
                gameType = "SPANISH";
                break;
            }
            case 2 -> {
                gameType = "COLOMBIAN";
                break;
            }
            case 3 -> {
                gameType = "MEXICAN";
                break;
            }
        }

    }
}
