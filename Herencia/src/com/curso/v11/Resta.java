package com.curso.v11;

public class Resta extends OperacionAbs{

	Resta(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return x-y;
	}

}

