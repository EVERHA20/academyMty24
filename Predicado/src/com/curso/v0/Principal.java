package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Filologo",25,300.0);
		
		boolean esMayorEdad;
		
//		Predicado pre = new Predicado() {
//			@Override
//			public boolean probar(Empleado e) {
//				return e.edad>=18;
//			}
//		};
		
		//DEFINICION DE LA LAMBDA
		Predicado pre =  e -> e.edad>=18;
		
		//EJECUTAR LA LAMBADA
		esMayorEdad = pre.probar(e1);
		
		System.out.println(e1);
		System.out.println("Es mayor de edad: "+esMayorEdad);
		
	}

}
