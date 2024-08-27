package com.curso.v2;

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
