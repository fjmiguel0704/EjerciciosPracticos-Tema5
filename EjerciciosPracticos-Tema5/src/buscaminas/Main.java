package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		String tabla[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };
		String incognita[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };

		int posicionMina = 0;
		int casillaUsuario = 0;

		Funciones.generaMinas(tabla, posicionMina);
		Funciones.pintaTablero(tabla);
		System.out.println(Arrays.toString(incognita));
		Funciones.esGanador(casillaUsuario, incognita, tabla);
	}

}

