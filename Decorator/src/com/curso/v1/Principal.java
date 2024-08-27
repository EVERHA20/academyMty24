package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Component mesaBambu = new MesaBambu(
					new Protector(
					new LapTop()));
		
		System.out.println(mesaBambu.getNombrePrecio());
		System.out.println(mesaBambu.getCostoTotal());

	}

}
