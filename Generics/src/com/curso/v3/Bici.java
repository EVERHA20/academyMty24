package com.curso.v3;

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

}