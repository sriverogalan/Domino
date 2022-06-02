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

    // random color generator no repetitions
    public String getRandomColor() {
        Random random = new Random();
        int color = random.nextInt(5);
        return switch (color) {
            case 0 -> RED;
            case 1 -> GREEN;
            case 2 -> PURPLE;
            case 3 -> BLUE;
            case 4 -> YELLOW;
            default -> CYAN;
        };
    }
}
