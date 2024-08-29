package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Calculadora cal = new Calculadora();
		
		cal.setOperacion(new Multi());
		
		double d = cal.ejecutarOperacion(8, 4);
		
		System.out.println("Resultado: "+d);
		
		cal.setOperacion(new Suma());
		
		d = cal.ejecutarOperacion(8, 4);
		
		System.out.println("Resultado: "+d);
		
		cal.setOperacion(new Exponencial());
		
		d = cal.ejecutarOperacion(8, 4);
		
		System.out.println("Resultado: "+d);
	}

}
