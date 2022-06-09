package utils;
import card.Card;
import lombok.experimental.UtilityClass;
import player.Player;
@UtilityClass
public class Text {
    public static void startDomino() {
        System.out.println("\n\n Bienvenido al juego de domino \n\n");
    }
    public static void step(Player player) {
        System.out.println("\n\n" + player.toString() + " Ha decidido pasar su turno \n\n");
    }
    public static void separator() {
        System.out.println(" ");
        System.out.println(Colors.RESET + "-----------------------------------------------------");
        System.out.println(" ");
    }
    public static void start() {
        System.out.println("Introduce el número para elegir las reglas que quiere: ");
        System.out.println("1. Internacional Robar (Draw)");
        System.out.println("2. Internacional Sin Robar (Block)");
        System.out.println("3. Tapadito");
    }
    public static void doYouPlayAgain() {
        System.out.println("¿Quieres jugar otra vez? (1 = Si / 2 = No");}
    public static void playerName(int num) {
        System.out.println("¿Como quieres que te llamemos Jugador " + num + " ?");
    }
    public static void startInternationalGame() {
        System.out.println("\n\n¡Bienvenido al juego de Dominó International Robar(Draw)!\n\n");
        System.out.println("Estas son las reglas del juego: \n");
        System.out.println("1. Éste es el modo más popular, también jugado mayormente en los dominos de habla hispana. Cuando el jugador no tiene fichas debe robar del montón para seguir en el juego.\n");
        System.out.println("2. Si se acaban las fichas de la baraja de la mesa, se pasa el turno hasta que uno de los jugadores pueda lanzar.\n");
        System.out.println("3. Gana el jugador que se quede sin fichas en la mano.\n");
        System.out.println("\n\n¿Como quieres que te llamemos Jugador 1 ?");
    }
    public static void errorNotPutHereInternational(){
        System.out.println(Colors.RED + "ERROR: No se puede poner la carta aquí"+ Colors.RESET);
    }
    public static void startInternationalBlockGame(){
        System.out.println("¡Bienvenido al juego de Dominó International Sin Robar(Block)!\n\n");
        System.out.println("Estas son las reglas del juego: \n");
        System.out.println("1. En este modo no se roban fichas adicionales. El juego termina cuando un jugador gana jugando su última ficha.\n");
        System.out.println("2. Si se te acaban las fichas de la mano se pasa el turno al siguiente jugador, y así hasta que uno de los jugadores gane\n");
        System.out.println("3. Gana el jugador que se quede sin fichas en la mano.\n");
        System.out.println("\n\n¿Como quieres que te llamemos Jugador 1 ?");
    }
    public static void chooseWhatYouWantToDoInternationalDrawGame(Player player) {
        System.out.println(player.getColor() + "¿Qué quieres hacer " + player.getName() + "?");
        System.out.println("1. Tirar una carta");
        System.out.println("2. Coger una carta");
    }
    public static void chooseWhatYouWantToDoInternationalBlockGame(Player player) {
        System.out.println(player.getColor() + "¿Qué quieres hacer " + player.getName() + "?");
        System.out.println("1. Tirar una carta");
        System.out.println("2. Pasar turno");
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
        System.out.println(Colors.RED + "ERROR : Número no válido"+ Colors.RESET);
    }
    public static void chooseRivals() {
        System.out.println("¿Contra cuántos jugadores quieres competir?");
        System.out.println("1. Uno contra uno");
        System.out.println("2. Uno contra dos ");
        System.out.println("3. Uno contra tres");
    }
    public static void playCard(Player player) {
        System.out.println(player.getColor() + "¿Qué carta quieres tirar " + player.toString() + " ?");
    }
    public void winner(Player player) {
        System.out.println("El ganador es " + player.toString() + " gracias por jugar al domino internacional :) ");
    }
}