package com.curso.v6;

public class CompuMac implements Computadora {

	//Encapsular
	private String version;

	public CompuMac(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender Mac "+ version);
	}
	
	
}
