package com.curso.pizzafm;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String nombre;
	String masa;
	String salsa;
	List<String> ingredientes = new ArrayList<>();
 
	final public void preparar() {
		System.out.println("Preparando " + nombre);
		System.out.println("Preparando masa ...");
		System.out.println("Agregando salsa ...");
		System.out.println("Agregando ingredientes: ");
		for (int i = 0; i < ingredientes.size(); i++) {
			System.out.println("   " + ingredientes.get(i));
		}
	}
  
	public void hornear() {
		System.out.println("Horneando...");
	}
 
	public void cortar() {
		System.out.println("Cortando....");
	}
  
	public void empaquetar() {
		System.out.println("Empaquetando...");
	}
 
	public String getNombre() {
		return nombre;
	}

	public String toString() {
		StringBuilder mostrar = new StringBuilder();
		mostrar.append("---- " + nombre + " ----\n");
		mostrar.append("masa: "+masa + "\n");
		mostrar.append("salsa: "+salsa + "\n");
		for (int i = 0; i < ingredientes.size(); i++) {
			mostrar.append("ingrediente "+ (i+1) +": "+(String )ingredientes.get(i) + "\n");
		}
		return mostrar.toString();
	}
}

 
 
