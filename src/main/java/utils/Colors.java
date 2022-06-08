package utils;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class Colors {
    public String RESET = "\u001B[0m";
    public String RED = "\u001B[31m";
    public String GREEN = "\u001B[32m";
    public String PURPLE = "\u001B[35m";
    public String BLUE = "\u001B[36m";
    public String YELLOW = "\u001B[33m";
    public String CYAN = "\u001B[36m";
    public String BOLD = "\u001B[1m";
    public String UNDERLINE = "\u001B[4m";
    public String BRIGHT = "\u001B[1m";
    public String DARK = "\u001B[2m";
    public String ITALIC = "\u001B[3m";
    public String BLACK_BACKGROUND = "\u001B[40m";
    public String RED_BACKGROUND = "\u001B[41m";
    public String GREEN_BACKGROUND = "\u001B[42m";
    public String YELLOW_BACKGROUND = "\u001B[43m";
    public String BLUE_BACKGROUND = "\u001B[44m";
    public String PURPLE_BACKGROUND = "\u001B[45m";
    public String CYAN_BACKGROUND = "\u001B[46m";

    // random color generator no repetitions
    public String getRandomColor() {
        Random random = new Random();
        int color = random.nextInt(8);
        return switch (color) {
            case 0 -> ITALIC;
            case 1 -> GREEN;
            case 2 -> PURPLE;
            case 3 -> BLUE;
            case 4 -> YELLOW;
            case 6 -> BRIGHT;
            case 7 -> DARK;

            default -> CYAN;
        };
    }
}
