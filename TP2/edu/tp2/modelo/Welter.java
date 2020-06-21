package edu.tp2.modelo;

public class Welter extends Categoria {

	@Override
	public double pesoMinimo() {
		return 63.503;
	}

	@Override
	public double pesoMaximo() {
		return 66.678;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Ligero();
	}

}
