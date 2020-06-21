package edu.tp2.modelo;

public class Gallo extends Categoria {

	@Override
	public double pesoMinimo() {
		return 52.163;
	}

	@Override
	public double pesoMaximo() {
		return 53.525;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Mosca();
	}
	
}
