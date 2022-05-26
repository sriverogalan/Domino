package utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    public static void textPrincipal() {
        System.out.println("Bienvenido al domino");
        System.out.println("1. Jugar a la partida anterior");
        System.out.println("2. Jugar una nueva partida");
        System.out.println("3. Salir");
    }

    public static void errorChoose(int min, int max) {
        System.out.println("Introduce un numero entre " + min + " y " + max);
    }

}