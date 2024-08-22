package com.curso.v4;

@FunctionalInterface
public interface Predicado<T> {

	boolean probar(T t);

	static <T> Predicado<T> and(Predicado<T> pre1, Predicado<T> pre2) {

		// FUNCIONES DE ORDEN SUPERIOR (Retornar una lambda)
		return x -> (pre1.probar(x) && pre2.probar(x));

	}

	static <T> Predicado<T> or(Predicado<T> pre1, Predicado<T> pre2) {

		//FUNCIONES DE ORDEN SUPERIOR (Retornar una lambda)
		return x -> (pre1.probar(x) || pre2.probar(x));

	}
	
	static <T> Predicado<T> negate(Predicado<T> pre) {

		//FUNCIONES DE ORDEN SUPERIOR (Retornar una lambda)
		return x -> (!pre.probar(x));

	}

}
