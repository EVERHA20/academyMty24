package com.curso.v2;

import com.curso.strategy.ComportamientoVolar;

public class Pato implements Ave {
	
	//HAS-A
	ComportamientoVolar cv;

	@Override
	public void volar() {
		cv.ejecutaVuelo();
	}

}
