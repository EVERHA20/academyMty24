package com.curso.v11;

public class Exponencial extends OperacionAbs{

	Exponencial(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}

}
