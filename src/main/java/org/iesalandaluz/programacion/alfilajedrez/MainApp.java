package org.iesalandaluz.programacion.alfilajedrez;

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
		System.out.println("Opción 1.");
		System.out.println("Opción 2.");
	}

	private static int elegirOpcion() {
		return 0;
	}

	private static void ejecutarOpcion(int opcion) {

	}

	private static void crearAlfilDefecto() {

	}

	private static void crearAlfilColor() {

	}

	private static Color elegirColor() {
		return Color.NEGRO;
	}

	private static void crearAlfilColorColumna() {

	}

	private static char elegirColumnaInicial() {
		return '0';
	}

	private static void mover() {

	}

	private static void mostrarMenuDirecciones() {

	}

	private static Direccion elegirDireccion() {
		return Direccion.ABAJO_DERECHA;
	}
}
