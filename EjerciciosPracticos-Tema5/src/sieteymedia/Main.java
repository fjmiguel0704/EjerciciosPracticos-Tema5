package sieteymedia;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Main {
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		Funciones.turnoJugador1();
		Funciones.turnoJugador2();
		Funciones.esGanador();

	}

}
