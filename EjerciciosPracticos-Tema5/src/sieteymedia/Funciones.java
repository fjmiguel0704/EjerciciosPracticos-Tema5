package sieteymedia;

public class Funciones {

	// Guardará la puntuación del jugador 1
	static double valorJ1 = 0;

	// Guardará la puntuación del jugador 1
	static double valorJ2 = 0;

	// Guardará el número del tipo de carta que es
	static int palo;

	// Posiciones de los valores del array
	static int numero;

	// Tipo de carta
	static String paloEscrito = "";

	// Registra las respuestas del primer jugador
	static String respuestaJ1 = "";

	// Registra las respuestas del segundo jugador
	static String respuestaJ2 = "";

	// Puntuación ganadora
	static final double PUNTUACION_GANADORA = 7.5;

	/**
	 * Este método generará un número aleatorio según los valores del array y le
	 * asignará esa tirada a la puntuación del primer jugador, mientras indique que
	 * desea lanzar una carta. Generará otro para comprobar el tipo de carta y
	 * mostrará su carta y puntuación actual. Comprobará si se ha pasado de la
	 * puntuación máxima, y en caso de haberse pasado, el jugador 2 gana la partida,
	 * si no, volvería a preguntar si desea seguir jugando.
	 * 
	 * @param tabla array que contiene los valores
	 */
	public static void turnoJugador1(double[] tabla) {
		while (respuestaJ1.equals("s")) {
			numero = (int) (Math.random() * tabla.length);
			valorJ1 += tabla[numero];

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

			if (numero <= 6 && numero >= 0) {
				System.out.println("Tu carta es: " + tabla[numero] + " de " + paloEscrito);
			}

			if (numero == 7) {
				System.out.println("Tu carta es: " + (numero + 1) + " sota de " + paloEscrito);
			}
			if (numero == 8) {
				System.out.println("Tu carta es: " + (numero + 1) + " caballo de " + paloEscrito);
			}

			if (numero == 9) {
				System.out.println("Tu carta es: " + (numero + 1) + " rey de " + paloEscrito);
			}

			System.out.println("Tienes " + valorJ1 + " puntos");
			if (valorJ1 > PUNTUACION_GANADORA) {
				System.out.println("Has perdido, te has pasado...");
				System.out.println("Ha ganado Jugador 2");
				break;
			}
			System.out.println("¿Quieres seguir jugando? s/n");
			Funciones.respuestaJ1 = Main.read.next();
		}
	}

	/**
	 * Este método generará un número aleatorio según los valores del array y le
	 * asignará esa tirada a la puntuación del segundo jugador, mientras indique que
	 * desea lanzar una carta. Generará otro para comprobar el tipo de carta y
	 * mostrará su carta y puntuación actual. Comprobará si se ha pasado de la
	 * puntuación máxima, y en caso de haberse pasado, el jugador 1 gana la partida,
	 * si no, volvería a preguntar si desea seguir jugando.
	 * 
	 * @param tabla tabla array que contiene los valores
	 */
	public static void turnoJugador2(double[] tabla) {
		while (respuestaJ2.equals("s")) {
			numero = (int) (Math.random() * tabla.length);
			valorJ2 += tabla[numero];

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

			if (numero <= 6 && numero >= 0) {
				System.out.println("Tu carta es: " + tabla[numero] + " de " + paloEscrito);
			}

			if (numero == 7) {
				System.out.println("Tu carta es: " + (numero + 1) + " sota de " + paloEscrito);
			}
			if (numero == 8) {
				System.out.println("Tu carta es: " + (numero + 1) + " caballo de " + paloEscrito);
			}

			if (numero == 9) {
				System.out.println("Tu carta es: " + (numero + 1) + " rey de " + paloEscrito);
			}

			System.out.println("Tienes " + valorJ2 + " puntos");
			if (valorJ2 > PUNTUACION_GANADORA) {
				System.out.println("Has perdido, te has pasado...");
				System.out.println("Ha ganado Jugador 1");
				break;
			}
			System.out.println("¿Quieres seguir jugando? s/n");
			Funciones.respuestaJ2 = Main.read.next();

		}
	}

	/**
	 * Este método comprobará que jugador ha terminado la partida con mayor puntuación e
	 * indicará quien es ganador. En caso de tener la misma puntuación será un
	 * empate
	 */
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