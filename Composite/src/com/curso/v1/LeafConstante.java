package com.curso.v1;

public class LeafConstante implements Component {

	private double value;
		
	public LeafConstante(double value) {
		this.value = value;
	}

	@Override
	public double getValue() {
		return value;
	}

}
