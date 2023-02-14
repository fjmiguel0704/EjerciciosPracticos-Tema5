package sieteymedia;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double valorJ1 = 0;
		double valorJ2 = 0;
		int palo;
		int numero;
		String paloEscrito = "";
		String respuestaJ1 = "";
		String respuestaJ2 = "";

		System.out.println("Turno de jugador 1");
		System.out.println("¿Quieres sacar una carta? s/n");
		respuestaJ1 = read.next();

		while (respuestaJ1.equals("s")) {
			numero = (int) (Math.random() * 10) + 1;

			if (numero == 8 || numero == 9 || numero == 10) {
				valorJ1 += 0.5;
			} else {
				valorJ1 += numero;
			}

			palo = (int) (Math.random() * 4) + 1;
			if (palo == 1) {
				paloEscrito = "copa";
			}

			if (palo == 2) {
				paloEscrito = "oro";
			}

			if (palo == 3) {
				paloEscrito = "espada";
			}

			if (palo == 4) {
				paloEscrito = "basto";
			}

			System.out.println("Tu carta es: " + numero + " de " + paloEscrito);
			System.out.println("Tienes " + valorJ1 + " puntos");
			if (valorJ1 > 7.5) {
				System.out.println("Has perdido, te has pasado...");
				System.out.println("Ha ganado Jugador 2");
				break;
			}
			System.out.println("¿Quieres seguir jugando? s/n");
			respuestaJ1 = read.next();
		}

		if (respuestaJ1.equals("n")) {
			System.out.println("Turno de jugador 2");
			System.out.println("¿Quieres sacar una carta? s/n");
			respuestaJ2 = read.next();
			while (respuestaJ2.equals("s")) {
				numero = (int) (Math.random() * 10) + 1;

				if (numero == 8 || numero == 9 || numero == 10) {
					valorJ2 += 0.5;
				} else {
					valorJ2 += numero;
				}

				palo = (int) (Math.random() * 4) + 1;
				if (palo == 1) {
					paloEscrito = "copa";
				}

				if (palo == 2) {
					paloEscrito = "oro";
				}

				if (palo == 3) {
					paloEscrito = "espada";
				}

				if (palo == 4) {
					paloEscrito = "basto";
				}

				System.out.println("Tu carta es: " + numero + " de " + paloEscrito);
				System.out.println("Tienes " + valorJ2 + " puntos");
				if (valorJ2 > 7.5) {
					System.out.println("Has perdido, te has pasado...");
					System.out.println("Ha ganado Jugador 1");
					break;
				}
				System.out.println("¿Quieres seguir jugando? s/n");
				respuestaJ2 = read.next();
			}
		}

		if (respuestaJ2.equals("n")) {
			if (valorJ1 > valorJ2) {
				System.out.println("Ha ganado Jugador 1");
			}

			else if (valorJ2 > valorJ1) {
				System.out.println("Ha ganado Jugador 2");
			}

			if (valorJ1 == valorJ2) {
				System.out.println("Empate");
			}
		}
	}

}
