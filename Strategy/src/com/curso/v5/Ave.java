package com.curso.v5;

import com.curso.strategy.ComportamientoVolar;
import com.curso.strategy.SiVolar;

public abstract class Ave {
	
	//HAS-A
	ComportamientoVolar cv = new SiVolar();

	void volar() {
		cv.ejecutaVuelo();
	}

}
