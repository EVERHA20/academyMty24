package com.curso.v4;

public class Motoneta  implements Transporte {
	
	private String marca;
	
	public Motoneta(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String nombre) {
		marca = nombre;
	}

	@Override
	public String toString() {
		return "Motoneta [marca=" + marca + "]";
	}
	
	

}