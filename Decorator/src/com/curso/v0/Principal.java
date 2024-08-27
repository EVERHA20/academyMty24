package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Component laptop = new LapTop();
		
		System.out.println(laptop.getNombrePrecio());
		
		System.out.println("*************");
		
		Component protector = new Protector(laptop);
		
		System.out.println(protector.getNombrePrecio());
		System.out.println(protector.getCostoTotal());

	}

}
