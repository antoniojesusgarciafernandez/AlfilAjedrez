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
		alfil.toString();
	}

	private static void mostraMenu() {
		System.out.println("**** MENU ****");
		System.out.println("Opción 1.");
		System.out.println("Opción 2.");
	}

	private static int elegirOpcion() {
		int opcion;
		System.out.println("Elige una opción");
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
		alfil = new Alfil();
	}

	private static void crearAlfilColor() {

	}

	private static Color elegirColor() {
		String colorIntroducido;
		Color color = null;

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
		return color;
	}

	private static void crearAlfilColorColumna() {

	}

	private static char elegirColumnaInicial() {
		char columna;
		System.out.println("Elige la columna");
		do {
			System.out.print("Introduzca la columna correcta: ");
			columna = Entrada.caracter();

		} while (columna < 'a' || columna > 'h');

		return columna;
	}

	private static void mover() {

	}

	private static void mostrarMenuDirecciones() {
		System.out.println("**** MENU DIRECCION****");
		System.out.println("Opción 1 ARRIBA_DERECHA.");
		System.out.println("Opción 2 ABAJO_DERECHA.");
		System.out.println("Opción 3 ARRIBA_IZQUIERDA.");
		System.out.println("Opción 4 ABAJO_IZQUIERDA.");
	}

	private static Direccion elegirDireccion() {
		int opcion;
		Direccion direccion = null;
		System.out.println("Elija una opcion");
		
		do {
			System.out.print("Introduzca la columna correcta: ");
			opcion = Entrada.caracter();

		} while (opcion < 0 || opcion > 5);

		switch (opcion) {
		case 1: {
			return direccion.ARRIBA_DERECHA;
		}
		case 2: {

			return direccion.ABAJO_DERECHA;
		}
		case 3: {

			return direccion.ARRIBA_IZQUIERDA;
		}
		case 4: {

			return direccion.ABAJO_IZQUIERDA;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}

		
	}
}
