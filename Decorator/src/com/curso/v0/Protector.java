package com.curso.v0;

public class Protector extends Decorator {
	
	public Protector(Component componente) {
		super(componente);
		nombreAccesorio = "Protector";
		precioAccesorio = 77.77;
	}

}
