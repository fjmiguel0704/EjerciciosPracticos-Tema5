package sieteymedia;

public class Funciones {
	static double valorJ1 = 0;
	static double valorJ2 = 0;
	static int palo;
	static int numero;
	static String paloEscrito = "";
	static String respuestaJ1 = "";
	static String respuestaJ2 = "";
	static final double  PUNTUACION_GANADORA = 7.5;

	public static void turnoJugador1() {
		System.out.println("Turno de jugador 1");
		System.out.println("¿Quieres sacar una carta? s/n");
		respuestaJ1 = Main.read.next();

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
			if (valorJ1 > PUNTUACION_GANADORA) {
				System.out.println("Has perdido, te has pasado...");
				System.out.println("Ha ganado Jugador 2");
				break;
			}
			System.out.println("¿Quieres seguir jugando? s/n");
			respuestaJ1 = Main.read.next();
		}
	}

	public static void turnoJugador2() {
		if (respuestaJ1.equals("n")) {
			System.out.println("Turno de jugador 2");
			System.out.println("¿Quieres sacar una carta? s/n");
			respuestaJ2 = Main.read.next();
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
				if (valorJ2 > PUNTUACION_GANADORA) {
					System.out.println("Has perdido, te has pasado...");
					System.out.println("Ha ganado Jugador 1");
					break;
				}
				System.out.println("¿Quieres seguir jugando? s/n");
				respuestaJ2 = Main.read.next();
			}
		}
	}

	public static void esGanador() {
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
