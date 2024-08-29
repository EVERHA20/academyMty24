package com.curso.v0;

public class Exponencial implements Operacion {

	@Override
	public double ejecuta(double x, double y) {
		return Math.pow(x, y);
	}

}
