package com.curso.v2;

import com.curso.strategy.ComportamientoVolar;

public class Aguila implements Ave {
	
	//has-a
	ComportamientoVolar cv;

	@Override
	public void volar() {
		cv.ejecutaVuelo();
	}

}
