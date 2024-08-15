package com.curso.v1;

public class Becario {
	
	//HAS-A
	private String nombre;
	
	//ALTO ACOPLAMIENTO
	private CompuWindows cw = new CompuWindows("XP");
	private CompuLinux cl = new CompuLinux("Ubuntu 18.0");

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void elaborarPrograma(String tipoCompu) {
		System.out.println(nombre + " comienza a programar");
		
		if (tipoCompu == "Win")
			cw.encender();
		else if (tipoCompu == "Lin")
			cl.encender();
		else 
			System.out.println("No puede programar");
		//...............
	}

}
