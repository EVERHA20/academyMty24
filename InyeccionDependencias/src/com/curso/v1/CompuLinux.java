package com.curso.v1;

public class CompuLinux {

	//Encapsular
	private String version;

	public CompuLinux(String version) {
		this.version = version;
	}
	
	void encender() {
		System.out.println("Encender Compu Linux "+ version);
	}
	
	
}
