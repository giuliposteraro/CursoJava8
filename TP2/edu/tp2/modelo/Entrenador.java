package edu.tp2.modelo;

import java.util.Vector;

public class Entrenador {
	public Entrenador(Vector<Boxeador> boxeadores, String nombre) {
		this.boxeadores = boxeadores;
		this.nombre = nombre;
	}

	Vector<Boxeador> boxeadores = new Vector<Boxeador>(5);
	String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Boxeador> getBoxeadores() {
		return boxeadores;
	}

	public void agregarBoxeador(Boxeador box) {
		this.boxeadores.add(box);
	}
}
