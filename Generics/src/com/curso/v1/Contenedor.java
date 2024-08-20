package com.curso.v1;

public class Contenedor {;
	
	//has-a
	Moto moto;
	Bici bici;
	Motoneta motoneta;

	public Contenedor(Moto moto) {
		this.moto = moto;
	}
	
	public Contenedor(Bici bici) {
		this.bici = bici;
	}
	
	public Contenedor(Motoneta motoneta) {
		this.motoneta = motoneta;
	}

}
