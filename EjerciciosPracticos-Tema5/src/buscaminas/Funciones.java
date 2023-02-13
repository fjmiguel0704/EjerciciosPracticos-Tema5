package buscaminas;

import java.util.Arrays;

public class Funciones {

	static public void generaMinas(String[] tablaOriginal, int mina) {
		for (int contador = 1; contador <= 6; contador++) {
			mina = (int) ((Math.random() * tablaOriginal.length));
			while (tablaOriginal[mina].equals("*")) {
				mina = (int) ((Math.random() * tablaOriginal.length));
			}

			tablaOriginal[mina] = "*";
		}
	}

	static public void pintaTablero(String[] tablaOriginal) {
		for (int i = 0; i < tablaOriginal.length; i++) {

			if (i == 0 && !tablaOriginal[i].equals("*") && tablaOriginal[i + 1].equals("*")) {
					tablaOriginal[i] = "1";			
			}

			else if (i == 19 && !tablaOriginal[i].equals("*") && tablaOriginal[i - 1].equals("*")) { 
					tablaOriginal[i] = "1";
			}

			else if ((i != 0 && i != 19) && (tablaOriginal[i - 1].equals("*") && tablaOriginal[i + 1].equals("*"))
					&& !tablaOriginal[i].equals("*")) {
				tablaOriginal[i] = "2";
			}

			else if ((i != 0 && i != 19) && (tablaOriginal[i - 1].equals("*") || tablaOriginal[i + 1].equals("*"))
					&& !tablaOriginal[i].equals("*")) {
				tablaOriginal[i] = "1";
			}

			else if (!tablaOriginal[i].equals("*")) {
				tablaOriginal[i] = "0";
			}

		}
	}

	static public void esGanador(int numeroUsuario, String[] tablaIncognita, String[] tablaOriginal) {
		int contadorX = 20;
		do {
			System.out.println("Que casilla desea destapar [1-20]: ");
			numeroUsuario = Main.read.nextInt();
			tablaIncognita[numeroUsuario - 1] = tablaOriginal[numeroUsuario - 1];
			contadorX--;
			System.out.println(Arrays.toString(tablaIncognita));
			if (contadorX == 6 && !tablaIncognita[numeroUsuario - 1].equals("*")) {
				System.out.println("¡Has ganado!");
				break;
			}
		} while (!tablaIncognita[numeroUsuario - 1].equals("*"));

		if (tablaIncognita[numeroUsuario - 1].equals("*")) {
			System.out.println("Has perdido...");
		}
	}

}