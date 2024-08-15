package com.curso.v2;

public class Estudiante {
	
	//Encapsular
	private String nombre;
	private int edad;

	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<18)
			throw new UnsupportedOperationException("Edad no permitida");
		this.edad = edad;
	}
	

}
