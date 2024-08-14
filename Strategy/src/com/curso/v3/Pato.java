package com.curso.v3;

import com.curso.strategy.ComportamientoVolar;

public class Pato extends Ave {
	
	//HAS-A
	ComportamientoVolar cv;

	@Override
	public void volar() {
		cv.ejecutaVuelo();
	}

}
