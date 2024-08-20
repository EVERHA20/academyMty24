package com.curso.v4;

public class Bici implements Transporte {
	
	private String marca;
	
	public Bici(String marca) {
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
		return "Bici [marca=" + marca + "]";
	}
	
}