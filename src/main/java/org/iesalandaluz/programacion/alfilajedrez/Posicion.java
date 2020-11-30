package org.iesalandaluz.programacion.alfilajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	//constructor
	
		public Posicion(int fila, char columna) {
			if ((fila<1 || fila>8) && (columna<'a' || columna> 'h') ) {
				throw new IllegalArgumentException("ERROR: Fila o columna no son v�lidos.");
			} else {
				setFila(fila);
				setColumna(columna);
			}
			
			
			
		}
		
		
	
	public int getFila() {
		return fila;
	}
	
	
	private void setFila(int fila) {
		
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("ERROR: Fila no v�lida.");
		}
		
		this.fila = fila;
	}
	
	
	public char getColumna() {
		return columna;
	}
	
	
	private void setColumna(char columna) {
		
		if (columna<'a' || columna> 'h') {
			throw new IllegalArgumentException("ERROR: Columna no v�lida.");
		}
		
		this.columna = columna;
		
		
	}
}
