package org.iesalandaluz.programacion.alfilajedrez;

public class Posicion {
	private int fila;
	private char columna;

	// constructor

	public Posicion(int fila, char columna) {
		if ((fila < 1 || fila > 8) && (columna < 'a' || columna > 'h')) {
			throw new IllegalArgumentException("ERROR: Fila o columna no son válidos.");
		} else {
			setFila(fila);
			setColumna(columna);
		}

	}

	public Posicion(Posicion posicion) {
		this.fila = posicion.fila;
		this.columna = posicion.columna;
	}

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {

		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}

		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {

		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}

		this.columna = columna;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
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
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
