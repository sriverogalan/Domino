package utils;

import java.util.Scanner;

public class Choose {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getInt(int min, int max) {
        int num = 0;
        boolean correcto = false;
        do {
            try {
                num = Integer.parseInt(scanner.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                Text.errorChoose(min, max);
            }
        } while (!correcto);
        return num;
    }
}