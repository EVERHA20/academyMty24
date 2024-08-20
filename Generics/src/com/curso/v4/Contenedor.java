package com.curso.v4;

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
	
	public <E> void mostrarCertificado(E e){
		System.out.println(u + " Certificado: "+e);
	}
}
