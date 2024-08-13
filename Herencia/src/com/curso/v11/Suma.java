package com.curso.v11;

//                  IS-A
public class Suma extends OperacionAbs{

	Suma(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return x+y;
	}
	

}
