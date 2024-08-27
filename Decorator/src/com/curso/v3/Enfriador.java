package com.curso.v3;

public class Enfriador extends Decorator {

	public Enfriador(Component componente) {
		super(componente);
		nombreAccesorio = "Enfriador";
		precioAccesorio = 60.00;
	}

}
