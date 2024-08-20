package com.curso.v4;

public class Moto  implements Transporte{
	
	private String marca;
	
	public Moto(String marca) {
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
		return "Moto [marca=" + marca + "]";
	}
	
	

}