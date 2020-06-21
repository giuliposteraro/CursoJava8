package edu.giuliana.modelo;

public class Auto {
	
	private String marca;
	private String modelo;
	private Persona persona;
	
	//Getters y Setters
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	//Constructor
	public Auto(String marca, String modelo, Persona persona) {
		this.marca = marca;
		this.modelo = modelo;
		this.persona = persona;
	}
	//Funcionalidad
	
	public boolean puedeArrancar() {
		return persona.getEdad() >= 18;
	}
	
	public int velocidadMaxima() {
		if(this.persona.getEdad() <= 30) {
			return 150;
		}
		else if(this.persona.getEdad() > 80) {
			return 70;
		}
			return 0; // Si no cumple ninguna de las dos condiciones es 0
	}

	public boolean estaOcupado() {
		return this.getPersona() != null;
	}
	
}
