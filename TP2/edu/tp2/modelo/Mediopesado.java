package edu.tp2.modelo;

public class Mediopesado extends Categoria {

	@Override
	public double pesoMinimo() {
		return 76.205;
	}

	@Override
	public double pesoMaximo() {
		return 79.378;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Mediano();
	}

}
