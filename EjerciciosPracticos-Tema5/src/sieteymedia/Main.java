package sieteymedia;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double valor = 0;
		int palo;
		int numero;
		String paloEscrito = "";
		String respuesta = "";

		System.out.println("Turno de jugador 1");
		System.out.println("¿Quieres sacar una carta? s/n");
		respuesta = read.next();
		while (respuesta.equals("s")) {
			numero = (int) (Math.random() * 10) + 1;

			if (numero == 8 || numero == 9 || numero == 10) {
				valor += 0.5;
			} else {
				valor += numero;
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
			System.out.println("Tienes " + valor + " puntos");
			if (valor > 7.5) {
				System.out.println("Has perdido, te has pasado...");
				break;
			}
			System.out.println("¿Quieres seguir jugando? s/n");
			respuesta = read.next();
		}
	}

}
