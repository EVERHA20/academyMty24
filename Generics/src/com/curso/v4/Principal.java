package com.curso.v4;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V4");
		
		Moto moto = new Moto("marcaA");
		
		Contenedor<Moto> cm = new Contenedor<>(moto);
		
		cm.mostrarCertificado(new String("XYA"));
		
		System.out.println("**************");
		
		Bici bici = new Bici("marcaZ");
		
		Contenedor<Bici> cb = new Contenedor<>(bici);
		
		cm.<StringBuilder>mostrarCertificado(new StringBuilder("1234X"));
		
		System.out.println("**************");

		Motoneta motoneta = new Motoneta("marcaZ");
		
		Contenedor<Motoneta> cmot = new Contenedor<>(motoneta);
		
		System.out.println(cmot.getU());
		
		cm.<Double>mostrarCertificado(Double.valueOf(4.59999999));

		//Integer integer = Integer.valueOf(8);
		
		//Contenedor<Integer> cInt = new Contenedor<>(integer);
			
	}

}
