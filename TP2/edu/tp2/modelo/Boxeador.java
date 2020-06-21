package edu.tp2.modelo;

public class Boxeador {
	String nombre;
	String apellido;
	int edad;
	double altura;
	double peso;
	Entrenador entrenadorAsignado;
	Categoria categoriaAsignada;
	
	public Boxeador(String nombre, String apellido, int edad, double altura, double peso, Entrenador entrenadorAsignado,
			Categoria categoriaAsignada) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.entrenadorAsignado = entrenadorAsignado;
		this.categoriaAsignada = categoriaAsignada;
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Categoria getCategoriaAsignada() {
		return categoriaAsignada;
	}
	public void setCategoriaAsignada(Categoria categoriaAsignada) {
		this.categoriaAsignada = categoriaAsignada;
	}

	public void asignarCategoria(Categoria cat) {
		if(cat.pesoMinimo()< this.getPeso()< cat.pesoMaximo()) {
			this.setCategoriaAsignada(cat);
		}
	}

}
