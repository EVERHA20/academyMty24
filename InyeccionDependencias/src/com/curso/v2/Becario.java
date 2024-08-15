package com.curso.v2;

public class Becario {
	
	//HAS-A
	private String nombre;
	
	//BAJO ACOPLAMIENTO
	Computadora compu; //<== INYECCION POR ATRIBUTO

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void elaborarPrograma() {
		System.out.println(nombre + " comienza a programar");
		compu.encender();
	}

}
