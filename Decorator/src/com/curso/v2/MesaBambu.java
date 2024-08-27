package com.curso.v2;

public class MesaBambu extends Decorator {

	public MesaBambu(Component componente) {
		super(componente);
		nombreAccesorio = "Mesa de Bambu";
		precioAccesorio = 40.00;
	}

}
