package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		Ave ave1 = new Aguila();
		ave1.volar();
		
		Ave ave2 = new Pato();
		ave2.volar();
		
		Ave ave3 = new Pinguino();
		ave3.volar();
	}

}
