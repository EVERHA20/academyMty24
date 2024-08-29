package com.curso.v0;

public class Calculadora {
	
	//HAS-A (Strategy)
	private Operacion operacion;
	
	double ejecutarOperacion(double x, double y ) {
		
		return operacion.ejecuta(x,y);
		
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

}
