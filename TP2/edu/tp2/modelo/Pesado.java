package edu.tp2.modelo;

public class Pesado extends Categoria {

	@Override
	public double pesoMinimo() {
		return 91;
	}

	@Override
	public double pesoMaximo() {
		return 0;
	}

	@Override
	public Categoria categoriaInferior() {
		return new Mediopesado();
	}

}
