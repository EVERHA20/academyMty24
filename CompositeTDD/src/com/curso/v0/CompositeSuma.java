package com.curso.v0;

//                         IS-A
public class CompositeSuma implements Component {
	
	//HAS-A
	Component compIzquierdo;
	Component compDerecho;

	public CompositeSuma(Component compIzquierdo, Component compDerecho) {
		this.compIzquierdo = compIzquierdo;
		this.compDerecho = compDerecho;
	}

	@Override
	public double getValor() {
		return compIzquierdo.getValor()+compDerecho.getValor();
	}

}
