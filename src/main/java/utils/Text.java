package utils;

import card.Card;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {
    public static void principal() {
        System.out.println("Bienvenido al domino, introduce el número para elegir las reglas que quiere: ");
        System.out.println("1. Español ");
        System.out.println("2. Colombiano");
        System.out.println("3. Mexicano");
    }

    // nameFirstPlayer
    public static void namePlayer(int num) {
        System.out.println("¿Como quieres que te llamemos Jugador " + num + " ?");
    }

    public static void rulesSpanish() {
        System.out.println("Reglas del juego: ");
        System.out.println("1. El juego consiste en una partida de 2, 3, 4 jugadores. ");
        System.out.println("2. Cada jugador tiene una mano de 7 cartas. ");
        System.out.println("3. El jugador que empieza la partida, tiene la primera carta de la mesa. ");
    }
    public static void startSpanishGame() {
        System.out.println("Bienvenido al juego de domino Español, introduce el número para elegir los jugadores que sereis: ");
        System.out.println("1. 2 jugadores sin CPU");
        System.out.println("2. 3 jugadores sin CPU");
        System.out.println("3. 4 jugadores sin CPU");
        System.out.println("4. 2 jugadores con CPU");
        System.out.println("5. 3 jugadores con CPU");
        System.out.println("6. 4 jugadores con CPU");
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
        System.out.println("¿A dónde quieres tirar la carta " + card.toString() + "?");
        System.out.println("1. A la izquierda");
        System.out.println("2. A la derecha");
    }

    public static void playCard() {
        System.out.println("¿Qué carta quieres tirar?");
    }

}