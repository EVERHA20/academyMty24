package com.curso.v1;

//                              IS-A
public abstract class Decorator implements Component {
	
	//      HAS A
	private Component componente;
	String nombreAccesorio;
	double precioAccesorio;
	
	public Decorator(Component componente) {
		this.componente = componente;
	}
	
	@Override
	public String getNombrePrecio() {
		return componente.getNombrePrecio() + "\n" +
				nombreAccesorio + ": " + precioAccesorio;
	}

	@Override
	public double getCostoTotal() {
		return componente.getCostoTotal() + precioAccesorio;
	}
	

}
