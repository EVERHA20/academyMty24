package com.curso.v3;

public class LapTop extends Component{
	
	LapTop(){
		nombreAccesorio = "Laptop: ";
		precioAccesorio = 800;
	}

	@Override
	public String getNombrePrecio() {
		return nombreAccesorio + getCostoTotal();
	}

	@Override
	public double getCostoTotal() {
		return precioAccesorio;
	}

}
