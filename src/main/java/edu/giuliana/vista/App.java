package edu.giuliana.vista;

import edu.giuliana.modelo.Auto;
import edu.giuliana.modelo.Persona;

public class App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Giuliana","Posteraro",21);
		Auto a1 = new Auto("Chevrolet","Agile",p1);
  
		if(a1.estaOcupado()) { //Idem con cualquier otro auto
			System.out.println("El auto " + a1.getMarca() + " " + a1.getModelo() + " ya esta siendo manejado");
		}
		else {
			System.out.println("El auto " + a1.getMarca() + " " + a1.getModelo() + " puede ser manejado");
		}
		
	}

}
