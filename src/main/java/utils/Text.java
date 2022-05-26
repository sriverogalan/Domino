package utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    public static void errorChoose(int min, int max) {
        System.out.println("Introduce un numero entre " + min + " y " + max);
    }

}