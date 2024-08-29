package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Calculadora cal = new Calculadora();
		
		cal.setOperacion((a,b)->a*b);
		
		double d = cal.ejecutarOperacion(8, 4);
		
		System.out.println("Resultado: "+d);
		
		cal.setOperacion((z,w)->z+w);
		
		d = cal.ejecutarOperacion(8, 4);
		
		System.out.println("Resultado: "+d);
		
		cal.setOperacion((d1,d2)->Math.pow(d1, d2));
		
		d = cal.ejecutarOperacion(8, 4);
		
		System.out.println("Resultado: "+d);
	}

}
