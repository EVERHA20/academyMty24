package com.curso.v11;

public class Multi extends OperacionAbs{

	Multi(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return x*y;
	}
}
