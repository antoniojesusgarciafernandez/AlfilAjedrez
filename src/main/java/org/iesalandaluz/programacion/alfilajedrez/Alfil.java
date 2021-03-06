package org.iesalandaluz.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

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

		this.color = color;
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

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (pasos < 0) {
			throw new IllegalArgumentException("ERROR: El valor introducido en pasos es negativo.");

		} else if (pasos >= 8) {
			throw new OperationNotSupportedException("ERROR: El valor introducido en pasos se sale del tablero.");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alfil [color=" + color + ", posicion=" + posicion + "]";
	}

	
}
