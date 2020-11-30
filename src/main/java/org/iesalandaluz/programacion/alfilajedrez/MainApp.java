package org.iesalandaluz.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static Alfil alfil;

	public MainApp() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static void mostrarAlfil() {
		alfil = new Alfil();
	}

	private static void mostraMenu() {
		System.out.println("**** MENU ****");
		System.out.println("Opci�n 1.");
		System.out.println("Opci�n 2.");
	}

	private static int elegirOpcion() {
		int opcion;
		System.out.println("Elige una opci�n");
		opcion = Entrada.entero();
		do {
			System.out.print("Introduzca una opcion correcta: ");
			opcion = Entrada.entero();

		} while (opcion < 1 || opcion > 2);

		return opcion;

	}

	private static void ejecutarOpcion(int opcion) {

	}

	private static void crearAlfilDefecto() {

	}

	private static void crearAlfilColor() {

	}

	private static Color elegirColor() {
		String colorIntroducido;
		System.out.println("Elige un color");
		colorIntroducido = Entrada.cadena();
		do {
			System.out.print("Introduzca un color correcto: ");
			colorIntroducido = Entrada.cadena();

		} while (colorIntroducido != "blanco" || colorIntroducido != "negro");

		if (colorIntroducido != "blanco") {
			return Color.BLANCO;
		} else if (colorIntroducido != "negro") {
			return Color.NEGRO;
		}

	}

	private static void crearAlfilColorColumna() {

	}

	private static char elegirColumnaInicial() {
		char columna;
		System.out.println("Elige la columna");
		do {
			System.out.print("Introduzca la columna correcta: ");
			columna = Entrada.caracter();

		} while (columna <'a'  || columna >'h');

		
		return columna;
	}

	private static void mover() {

	}

	private static void mostrarMenuDirecciones() {

	}

	private static Direccion elegirDireccion() {
		return Direccion.ABAJO_DERECHA;
	}
}
