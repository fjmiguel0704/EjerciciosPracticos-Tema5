package buscaminas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		String tabla[] = new String[20];
		String incognita[] = { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", "x",
				"x", "x" };
		int posicionMina;
		int casillaUsuario = 0;

		tabla[0] = "0";
		tabla[19] = "0";
		for (int contador = 1; contador <= 6; contador++) {
			posicionMina = (int) ((Math.random() * 19) + 1);
			while (tabla[posicionMina] == "*") {
				posicionMina = (int) ((Math.random() * 19) + 1);
			}

			tabla[posicionMina - 1] = "*";

			System.out.println(posicionMina);
		}

		for (int i = 0; i < tabla.length; i++) {

			if (i == 0 && tabla[i] != "*") {
				if (tabla[i + 1] == "*") {
					tabla[i + 1] = "1";
				}
			}

			else if (i == 19 && tabla[i] != "*") {
				if (tabla[i - 1] == "*") {
					tabla[i] = "1";
				}
			}

			else if ((i != 0 && i != 19) && (tabla[i - 1] == "*" && tabla[i + 1] == "*") && tabla[i] != "*") {
				tabla[i] = "2";
			}

			else if ((i != 0 && i != 19) && (tabla[i - 1] == "*" || tabla[i + 1] == "*") && tabla[i] != "*") {
				tabla[i] = "1";
			}

			else if (tabla[i] != "*") {
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
				if (contadorX == 6 && incognita[casillaUsuario - 1] != "*") {
					System.out.println("¡Has ganado!");
					break;
				}
			} while (incognita[casillaUsuario - 1] != "*");
			System.out.println("Has perdido...");
	}
}
