package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V2");
		Empleado e1 = new Empleado("Filologo",25,300.0);
		
		//DEFINICION DE LA LAMBDA
		Predicado<Empleado> pre0 =  e -> e.edad>=18;
		
		//EJECUTAR LA LAMBADA
		boolean esMayorEdad = pre0.probar(e1);
		
		System.out.println(e1);
		System.out.println("Es mayor de edad: "+esMayorEdad);
		
		Empleado e2 = new Empleado("Epenetox",17,6000.0);
		
		//DEFINICION DE LA LAMBDA
		Predicado<Empleado> pre1 =  z -> z.sueldo>5000;
		
		//EJECUTAR LA LAMBADA
		boolean sueldoMayorCincoMil = pre1.probar(e2);
		
		System.out.println(e2);
		System.out.println("Sueldo mayor 5,000: "+sueldoMayorCincoMil);
		
		esMayorEdad = pre0.probar(e2);
		System.out.println("Es mayor de edad: "+esMayorEdad);
		
		//DEFINICION DE LA LAMBDA
		Predicado<Empleado> pre2 =  pato -> pato.nombre.endsWith("x");
		System.out.println("Nombre ends x: "+pre2.probar(e2));
					
		Predicado<String> pre3 = cadena -> cadena.length() > 5;
		System.out.println(pre3.probar("Hello")); //false
		
		Predicado<Integer> pre4 = numero -> numero * numero > 100;
		System.out.println(pre4.probar(11)); //true
		
	}

}
