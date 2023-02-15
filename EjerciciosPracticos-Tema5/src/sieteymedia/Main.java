package sieteymedia;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Main {
	
	//Creamos el scanner para leer por teclado
	public static Scanner read = new Scanner(System.in);
	
	//Definimos el array manual con los valores de las cartas
	public static double tabla[] = { 1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5 };

	public static void main(String[] args) {

		//Le damos el turno al primer jugador 
		System.out.println("Turno de jugador 1");
		System.out.println("¿Quieres sacar una carta? s/n");
		Funciones.respuestaJ1 = read.next();
		
		//LLamamos a la función que ejecuta el turno del primer jugador
		Funciones.turnoJugador1(tabla);
		
		//Comprobamos la respuesta del jugador 1, y en caso de ser no, cedemos el turno al segundo jugador
		if (Funciones.respuestaJ1.equals("n")) {
			System.out.println("Turno de jugador 2");
			System.out.println("¿Quieres sacar una carta? s/n");
			Funciones.respuestaJ2 = Main.read.next();
		}
		
		//LLamamos a la función que ejecuta el turno del segundo jugador
		Funciones.turnoJugador2(tabla);
		
		//Llamamos a la función que comprobará que jugador es el ganador
		Funciones.esGanador();
	}

}