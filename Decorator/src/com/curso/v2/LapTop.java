package com.curso.v2;

public class LapTop implements Component{

	@Override
	public String getNombrePrecio() {
		return "Laptop: "+ getCostoTotal();
	}

	@Override
	public double getCostoTotal() {
		return 400.00;
	}

}
