package com.curso.v3;

import com.curso.strategy.ComportamientoVolar;

public class Pinguino extends Ave {
	
	ComportamientoVolar cv;

	@Override
	public void volar() {
		cv.ejecutaVuelo();
	}

}
