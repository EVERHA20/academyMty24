package com.curso.v3;

public class Contenedor<U extends Transporte> {
	
	private U u;
	
	public Contenedor(U u) {
		this.u = u;
	}

	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}
}
