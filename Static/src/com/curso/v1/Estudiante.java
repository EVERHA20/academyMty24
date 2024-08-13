package com.curso.v1;

public class Estudiante {
	
	String nombre;
	int edad;
	static int contador; //VARIABLE DE CLASE
	
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
