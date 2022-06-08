package utils;

import card.Card;
import lombok.experimental.UtilityClass;
import player.Player;

@UtilityClass
public class Text {
    //separator
    public static void separator() {
        System.out.println(" ");
        System.out.println(Colors.RESET + "-----------------------------------------------------");
        System.out.println(" ");
    }

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
    public static void chooseWhatYouWantToDo(Player player) {
        System.out.println(player.getColor() + "¿Qué quieres hacer " + player.getName() + "?");
        System.out.println("1. Tirar una carta");
        System.out.println("2. Coger una carta");
    }

    public static void wrongInput() {
        System.out.println(Colors.RED + "¡Error! Introduce un número válido" + Colors.RESET);
    }

    public static void chooseLeftOrRight(Card card) {
        System.out.println("¿A dónde quieres tirar la carta en el tablero " + card.toString() + "?");
        System.out.println("1. A la izquierda");
        System.out.println("2. A la derecha" + Colors.RESET);
    }

    public static void errorNumberNotValid() {
        System.out.println("ERROR : Número no válido");
    }


    public static void chooseRivals() {
        System.out.println("¿Contra cuántos jugadores quieres competir?");
        System.out.println("1. Uno contra uno");
        System.out.println("2. Uno contra dos ");
        System.out.println("3. Uno contra tres");
    }

    public static void playCard(Player player) {
        System.out.println("¿Qué carta quieres tirar " + player.getName() + " ?");
    }

    public void winner(Player player) {
        System.out.println("El ganador es " + player.getName() + " gracias por jugar al domino internacional :) ");
    }
}