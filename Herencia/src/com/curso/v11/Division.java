package com.curso.v11;

public class Division extends OperacionAbs{

	Division(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return x/y;
	}

}

