package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		
		Moto moto = new Moto("marcaA");
		
		Contenedor<Moto> cm = new Contenedor<>(moto);
		
		Bici bici = new Bici("marcaZ");
		
		Contenedor<Bici> cb = new Contenedor<>(bici);
		
		Motoneta motoneta = new Motoneta("marcaZ");
		
		Contenedor<Motoneta> cmot = new Contenedor<>(motoneta);
		
		Integer integer = Integer.valueOf(8);
		
		Contenedor<Integer> cInt = new Contenedor<>(integer);
			
	}

}
