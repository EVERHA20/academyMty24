package com.curso.v3;

public class Becario {
	
	//HAS-A
	private String nombre;
	
	//BAJO ACOPLAMIENTO
	private Computadora compu; 

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void elaborarPrograma() {
		System.out.println(nombre + " comienza a programar");
		compu.encender();
	}
	
	public void setCompu(Computadora compu) { //<== INYECCION POR SETTER
		this.compu = compu;
	}

}
