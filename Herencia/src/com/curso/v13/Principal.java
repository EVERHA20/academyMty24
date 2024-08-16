package com.curso.v13;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V13 Interfaces");

		
		Operacion[] operaciones = new Operacion[] {
				new Suma(8,4),
				new Exponencial(8,4),
				new Resta(8,4),
				new Multi(8,4),
				new Suma(6,3),
				new Division(8,4)
		};
		show(operaciones);
	}
	
	static void show(Operacion[] opes) {
		for(Operacion o:opes) {
			//POLIMORFISMO CON UNA INTERFACE
			System.out.println(o);
			System.out.println(o.ejecuta());
			if ( o instanceof Suma sum) {
				double d = sum.ejecuta(2.0,3.0);
				System.out.println("Suma doubles: "+d);
			}
		}
	}

}
