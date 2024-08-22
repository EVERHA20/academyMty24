package com.curso.v5;

@FunctionalInterface
public interface Predicado<T> {

	boolean probar(T t);

	default Predicado<T> and(Predicado<T> pre) {

		// FUNCIONES DE ORDEN SUPERIOR (Retornar una lambda)
		return x -> (this.probar(x) && pre.probar(x));

	}

	default Predicado<T> or(Predicado<T> pre) {

		//FUNCIONES DE ORDEN SUPERIOR (Retornar una lambda)
		return x -> (this.probar(x) || pre.probar(x));

	}
	
	default Predicado<T> negate() {

		//FUNCIONES DE ORDEN SUPERIOR (Retornar una lambda)
		return x -> (!this.probar(x));

	}

}
