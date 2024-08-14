package com.curso.v5;

import com.curso.strategy.NoVolar;

public class Pinguino extends Ave {

	Pinguino(){
		cv = new NoVolar();
	}

}
