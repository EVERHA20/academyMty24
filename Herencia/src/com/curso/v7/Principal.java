package com.curso.v7;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V6");
		
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		Operacion ope4 = new Resta(6,3);
		Operacion ope5 = new Division(8,4);


		Operacion[] operaciones = new Operacion[] {
				ope0,
				ope1,
				ope2,
				ope3,
				ope4,ope5
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
