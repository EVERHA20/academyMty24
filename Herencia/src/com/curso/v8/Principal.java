package com.curso.v8;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V8");

		Operacion[] operaciones = new Operacion[] {
				new Operacion(8,4),
				new Suma(8,4),
				new Exponencial(8,4),
				new Resta(8,4),
				new Multi(8,4),
				new Division(8,4)
		};
		show(operaciones);
	}
	
	static void show(Operacion[] opes) {
		for(Operacion o:opes) {
			//POLIMORFISMO
			System.out.println(o);
			System.out.println(o.ejecuta());
		}
	}

}
