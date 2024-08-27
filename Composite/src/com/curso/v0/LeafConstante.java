package com.curso.v0;

public class LeafConstante implements Component {

	double value;
		
	public LeafConstante(double value) {
		this.value = value;
	}

	@Override
	public double getValue() {
		return value;
	}

}
