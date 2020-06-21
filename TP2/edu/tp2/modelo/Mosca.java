package edu.tp2.modelo;

public class Mosca extends Categoria {

	@Override
	public double pesoMinimo() {
		return 48.988;
	}

	@Override
	public double pesoMaximo() {
		return 50.802;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Mosca();
	}
	
}
