package edu.tp2.modelo;

public class Mediano extends Categoria {

	@Override
	public double pesoMinimo() {
		return 69.853;
	}

	@Override
	public double pesoMaximo() {
		return 72.562;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Welter();
	}

}
