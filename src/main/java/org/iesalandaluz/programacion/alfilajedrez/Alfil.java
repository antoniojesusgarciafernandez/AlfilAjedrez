package org.iesalandaluz.programacion.alfilajedrez;

public class Alfil {

	private Color color;
	private Posicion posicion;

	public Alfil() {
		this.color = Color.NEGRO;
		this.posicion = new Posicion(8, 'f');
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		try {
			this.color = color;
		} catch (NullPointerException | IllegalArgumentException e) {
			System.err.println("ERROR: El color no es válido.");
		}

	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		try {
			this.posicion = posicion;
		} catch (NullPointerException | IllegalArgumentException e) {
			System.err.println("ERROR: La posicion no es válida.");
		}

	}

}
