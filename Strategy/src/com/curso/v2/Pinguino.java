package com.curso.v2;

import com.curso.strategy.ComportamientoVolar;

public class Pinguino implements Ave {
	
	ComportamientoVolar cv;

	@Override
	public void volar() {
		cv.ejecutaVuelo();
	}

}
