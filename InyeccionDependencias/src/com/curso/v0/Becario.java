package com.curso.v0;

public class Becario {
	
	//HAS-A
	private String nombre;
	
	//ALTO ACOPLAMIENTO
	private CompuWindows cw = new CompuWindows("XP");

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void elaborarPrograma() {
		System.out.println(nombre + " comienza a programar");
		cw.encender(); 
		//...............
	}

}
