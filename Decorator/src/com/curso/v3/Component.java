package com.curso.v3;

public abstract class Component {
	
	//HAS A
	private Component componente;
	String nombreAccesorio;
	double precioAccesorio;
	
	Component(){}
	
	Component(Component componente){
		this.componente = componente;
	}
	
	public String getNombrePrecio() {
		return componente.getNombrePrecio() + "\n" +
				nombreAccesorio + ": " + precioAccesorio;
	}

	public double getCostoTotal() {
		return componente.getCostoTotal() + precioAccesorio;
	}
	
}
