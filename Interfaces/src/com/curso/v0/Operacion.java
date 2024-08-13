package com.curso.v0;

public interface Operacion {
	
	static int ejecutaStatic(int x) {
		int r = ejecutaStaticPrivate(x);
		return r;
	}
	
	static private int ejecutaStaticPrivate(int x) {
		System.out.println("Paso por Private");
		return x*x;
	}

}
