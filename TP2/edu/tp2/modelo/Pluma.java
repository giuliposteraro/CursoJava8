package edu.tp2.modelo;

public class Pluma extends Categoria {

	@Override
	public double pesoMinimo() {
		return 55.338;
	}

	@Override
	public double pesoMaximo() {
		return 57.152;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Gallo();
	}

}
