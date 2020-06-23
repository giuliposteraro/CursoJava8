package edu.tp2.vista;

import java.util.Vector;

import edu.tp2.modelo.Boxeador;
import edu.tp2.modelo.Categoria;
import edu.tp2.modelo.Entrenador;
import edu.tp2.modelo.Pesado;

public class App {

	public static void main(String[] args) {
		Vector<Boxeador> boxeadoresIngresados = new Vector<Boxeador>(); 
		Entrenador entr1 = new Entrenador(boxeadoresIngresados,"Mickey Goldmill");
		Categoria cat1 = new Pesado(); 
		Boxeador box1 = new Boxeador("Rocky", "Balboa", 30, 1.77, 98, entr1 , cat1);
		entr1.agregarBoxeador(box1);
		
		
		System.out.println("La cantidad de boxeadores que ingresaron en el dia son: " +  boxeadoresIngresados.size());
		System.out.println("La cantidad de boxeadores asignados al entrenador" + " " + entr1.getNombre() + "son:" + entr1.getBoxeadores().size());
	}

}
