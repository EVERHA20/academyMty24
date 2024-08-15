package com.curso.v7;

public class Becario {
	
	//HAS-A
	private String nombre;
	
	//BAJO ACOPLAMIENTO
	private Computadora compu; 


	public Becario(String nombre,Computadora compu) { //<== INYECCION POR CONSTRUCTOR
		this.nombre = nombre;
		this.compu = compu;
	}
	
	void elaborarPrograma() {
		System.out.println(nombre + " comienza a programar");
		compu.encender();
	}
	
	public void setCompu(Computadora compu) { 
		this.compu = compu;
	}
	
	public Computadora getCompu() {
		return compu;
	}


}
