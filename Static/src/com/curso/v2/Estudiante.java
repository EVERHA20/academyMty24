package com.curso.v2;

public class Estudiante {
	
	//ENCAPSULAR
	private String nombre;
	private int edad;
	private static int contador; //VARIABLE DE CLASE
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public static int getContador() {
		return contador;
	}
	
}
