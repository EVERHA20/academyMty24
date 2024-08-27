package com.curso.v0;

//                         IS-A
public class CompositeMulti implements Component {
	
	//HAS-A
	Component compIzquierdo;
	Component compDerecho;

	public CompositeMulti(Component compIzquierdo, Component compDerecho) {
		this.compIzquierdo = compIzquierdo;
		this.compDerecho = compDerecho;
	}

	@Override
	public double getValor() {
		return compIzquierdo.getValor() * compDerecho.getValor();
	}

}
