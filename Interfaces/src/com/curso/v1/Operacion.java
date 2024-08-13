package com.curso.v1;

public interface Operacion {
	
	//public
	static int ejecutaStatic(int x) {
		int r = ejecutaStaticPrivate(x);
		return r;
	}
	
	static private int ejecutaStaticPrivate(int x) {
		System.out.println("Paso por Static Private");
		return x*x;
	}
	
	//public
	default int ejecutaDefault(int x) {
		int r = ejecutaPrivate(x);
		return r;
	}
	
	private int ejecutaPrivate(int x) {
		System.out.println("Paso por Private");
		return x+10;
	}

}
