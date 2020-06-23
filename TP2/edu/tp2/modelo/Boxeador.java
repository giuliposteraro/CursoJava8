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
	
	public Entrenador getEntrenadorAsignado() {
		return entrenadorAsignado;
	}
	public void setEntrenadorAsignado(Entrenador entrenadorAsignado) {
		this.entrenadorAsignado = entrenadorAsignado;
		entrenadorAsignado.agregarBoxeador(this);
	}

	public void asignarCategoria(Categoria cat) {
		if(Double.compare(cat.pesoMinimo(), this.getPeso())>0 && Double.compare(cat.pesoMaximo(), this.getPeso())<0) {
			this.setCategoriaAsignada(cat);
		}
		else {
			this.setCategoriaAsignada(cat.categoriaInferior());
		}
	}

}
