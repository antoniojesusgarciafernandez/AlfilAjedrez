package org.iesalandaluz.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

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

	private static void mostrarMenu() {
		System.out.println("**** MENU ****");
		System.out.println("Opción 1 mover.");
		System.out.println("Opción 2 salir.");
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
		mostrarMenu();

		opcion = Entrada.entero();
		do {
			System.out.print("Introduzca una opcion correcta: ");
			opcion = Entrada.entero();

		} while (opcion == 1 || opcion == 2);
		if (opcion == 1) { 
			mover();
		} else { 
			System.out.println("Ha salido de la aplicacion.");

		}

	}

	private static void crearAlfilDefecto() {
		alfil = new Alfil();
	}

	private static void crearAlfilColor() {
		alfil = new Alfil(Color.BLANCO);
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
		alfil = new Alfil(Color.BLANCO, 'f');
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
		int pasos;
		mostrarMenuDirecciones();
		Direccion direccion = elegirDireccion();
		do {
			System.out.print("Introduzca los pasos: ");
			pasos = Entrada.entero();

		} while (pasos <= 1 || pasos >= 8);

		try {
			alfil.mover(direccion, pasos);
		} catch (OperationNotSupportedException e) {
			e.getMessage();
		}

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
