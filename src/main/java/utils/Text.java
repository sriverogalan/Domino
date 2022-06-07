package utils;

import card.Card;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    public static void principal() {
        System.out.println("Bienvenido al domino, introduce el número para elegir las reglas que quiere: ");
        System.out.println("1. Internacional ");
        System.out.println("2. Colombiano");
        System.out.println("3. Mexicano");
    }

    // nameFirstPlayer
    public static void playerName(int num) {
        System.out.println("¿Como quieres que te llamemos Jugador " + num + " ?");
    }

    public static void startInternationalGame() {
        System.out.println("¡Bienvenido al juego de domino International!");
        System.out.println("¿Como quieres que te llamemos Jugador 1 ?");
    }

    // chooseWhatYouWantToDo
    public static void chooseWhatYouWantToDo() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Tirar una carta");
        System.out.println("2. Coger una carta");
    }

    public static void wrongInput() {
        System.out.println(Colors.RED + "¡Error! Introduce un número válido" + Colors.RESET);
    }
    public static void chooseLeftOrRight(Card card) {
        System.out.println("¿A dónde quieres tirar la carta en el tablero " + card.toString() + "?");
        System.out.println("1. A la izquierda");
        System.out.println("2. A la derecha");
    }


    public static void chooseRivals() {
        System.out.println("¿Contra cuántos jugadores quieres competir?");
        System.out.println("1. Uno contra uno");
        System.out.println("2. Uno contra dos ");
        System.out.println("3. Uno contra tres");
        System.out.println("4. Uno contra uno (BOT)");
        System.out.println("5. Uno contra dos (BOTS)");
        System.out.println("6. Uno contra tres (BOTS)");
    }

    public static void playCard() {
        System.out.println("¿Qué carta quieres tirar?");
    }

}