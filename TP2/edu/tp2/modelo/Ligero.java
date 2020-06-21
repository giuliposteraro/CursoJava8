package edu.tp2.modelo;

public class Ligero extends Categoria {

	@Override
	public double pesoMinimo() {
		return 58.967;
	}

	@Override
	public double pesoMaximo() {
		return 61.237;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Pluma();
	}

}
