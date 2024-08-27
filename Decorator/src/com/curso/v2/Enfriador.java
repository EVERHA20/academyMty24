package com.curso.v2;

public class Enfriador extends Decorator {

	public Enfriador(Component componente) {
		super(componente);
		nombreAccesorio = "Enfriador";
		precioAccesorio = 60.00;
	}

}
