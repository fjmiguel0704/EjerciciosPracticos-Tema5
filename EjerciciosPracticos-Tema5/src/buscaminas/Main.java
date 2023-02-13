package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String tabla[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };
		String incognita[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };

		int posicionMina;
		int casillaUsuario = 0;

		for (int contador = 1; contador <= 6; contador++) {
			posicionMina = (int) ((Math.random() * tabla.length));
			while (tabla[posicionMina].equals("*")) {
				posicionMina = (int) ((Math.random() * tabla.length));
			}

			tabla[posicionMina] = "*";

			System.out.println(posicionMina);
		}

		for (int i = 0; i < tabla.length; i++) {

			if (i == 0 && !tabla[i].equals("*")) {
				if (tabla[i + 1].equals("*")) {
					tabla[i + 1] = "1";
				}
			}

			else if (i == 19 && !tabla[i].equals("*")) {
				if (tabla[i - 1].equals("*")) {
					tabla[i] = "1";
				}
			}

			else if ((i != 0 && i != 19) && (tabla[i - 1].equals("*") && tabla[i + 1].equals("*"))
					&& !tabla[i].equals("*")) {
				tabla[i] = "2";
			}

			else if ((i != 0 && i != 19) && (tabla[i - 1].equals("*") || tabla[i + 1].equals("*"))
					&& !tabla[i].equals("*")) {
				tabla[i] = "1";
			}

			else if (!tabla[i].equals("*")) {
				tabla[i] = "0";
			}

		}

		System.out.println(Arrays.toString(tabla));

		System.out.println(Arrays.toString(incognita));

		int contadorX = 20;
		do {
			System.out.println("Que casilla desea destapar [1-20]: ");
			casillaUsuario = read.nextInt();
			incognita[casillaUsuario - 1] = tabla[casillaUsuario - 1];
			contadorX--;
			System.out.println(Arrays.toString(incognita));
			if (contadorX == 6 && !incognita[casillaUsuario - 1].equals("*")) {
				System.out.println("¡Has ganado!");
				break;
			}
		} while (!incognita[casillaUsuario - 1].equals("*"));

		if (incognita[casillaUsuario - 1].equals("*")) {
			System.out.println("Has perdido...");
		}
	}
}
