package com.curso.v4;

import com.curso.strategy.*;

public class Principal {

	public static void main(String[] args) {
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();

		System.out.println("Aguila");
		Ave ave1 = new Aguila();
		ave1.volar();
		
		ave1.cv = cv2;
		ave1.volar();
		
		System.out.println("Pato");
		Ave ave2 = new Pato();
		ave2.volar();
		
		System.out.println("Pinguino");
		Pinguino ave3 = new Pinguino();
		ave3.volar();

	}

}
