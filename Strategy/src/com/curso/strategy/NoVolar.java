package com.curso.strategy;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("NO Volar");
	}

}
