package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	//Creamos el scanner para leer por teclado
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		//Definimos el array que contendrá los valores del tablero original 
		String tabla[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };
		
		//El array con los valores ocultos que se le mostrará al usuario
		String incognita[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };

		//Guardará las posiciones del array en las que se encuentran las minas
		int posicionMina = 0;
		
		//Gaurdará el número de la casilla que el usuario desea destapar
		int casillaUsuario = 0;

		//Llámamos a la función que genera las minas 
		Funciones.generaMinas(tabla, posicionMina);
		
		//Llámamos a la función que genera el tablero original
		Funciones.pintaTablero(tabla);
		
		//Le mostramos al usuario el tablero oculto
		System.out.println(Arrays.toString(incognita));
		
		//Llámamos a la función que comprueba si se ha ganado o perdido
		Funciones.esGanador(casillaUsuario, incognita, tabla);
	}

}