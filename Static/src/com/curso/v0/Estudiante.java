package com.curso.v0;

public class Estudiante {
	
	String nombre;
	int edad;
	int contador; //VARIABLES DE INSTANCIA
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
