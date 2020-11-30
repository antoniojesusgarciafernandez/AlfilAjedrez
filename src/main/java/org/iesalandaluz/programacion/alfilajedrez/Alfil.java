package org.iesalandaluz.programacion.alfilajedrez;

public class Alfil {

	private Color color;
	private Posicion posicion;

	public Alfil() {
		this.color = Color.NEGRO;
		this.posicion = new Posicion(8, 'f');
	}

	public Alfil(Color color) {
		this.color = color;
		if (color == Color.BLANCO) {
			this.posicion = new Posicion(1, 'f');
		} else if (color == Color.NEGRO) {
			this.posicion = new Posicion(8, 'f');
		}

	}

	public Alfil(Color color, char columna) {
		if (columna != 'c' || columna != 'f') {
			throw new IllegalArgumentException("ERROR: Columna no v�lida.");
		}
		
		this.color=color;
		if (color == Color.BLANCO) {
			this.posicion = new Posicion(1, columna);
		} else if (color == Color.NEGRO) {
			this.posicion = new Posicion(8, columna);
		}

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		try {
			this.color = color;
		} catch (NullPointerException | IllegalArgumentException e) {
			System.err.println("ERROR: El color no es v�lido.");
		}

	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		try {
			this.posicion = posicion;
		} catch (NullPointerException | IllegalArgumentException e) {
			System.err.println("ERROR: La posicion no es v�lida.");
		}

	}

}
