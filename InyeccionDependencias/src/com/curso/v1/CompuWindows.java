package com.curso.v1;

public class CompuWindows {

	//Encapsular
	private String version;

	public CompuWindows(String version) {
		this.version = version;
	}
	
	void encender() {
		System.out.println("Encender Compu Windows "+ version);
	}
	
	
}
