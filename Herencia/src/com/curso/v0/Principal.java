package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Suma ope1 = new Suma();
		
		System.out.println(ope1.x);
		System.out.println(ope1.y);
		
		Suma ope2 = new Suma(8,4);
		
		System.out.println(ope2);
		System.out.println(ope2.x);
		System.out.println(ope2.y);

	}

}
