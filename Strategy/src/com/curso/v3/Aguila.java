package com.curso.v3;

import com.curso.strategy.ComportamientoVolar;

public class Aguila extends Ave {
	
	//has-a
	ComportamientoVolar cv;

	@Override
	public void volar() {
		cv.ejecutaVuelo();
	}

}
