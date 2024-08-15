package com.curso.v2;

public class CompuLinux implements Computadora {

	//Encapsular
	private String version;

	public CompuLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender Compu Linux "+ version);
	}
	
	
}
