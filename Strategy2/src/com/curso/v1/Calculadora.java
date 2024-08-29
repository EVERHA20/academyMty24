package com.curso.v1;

import java.util.function.BinaryOperator;

public class Calculadora {
	
	//HAS-A (Strategy)
	private BinaryOperator<Double> operacion;
	
	double ejecutarOperacion(double x, double y ) {
		return operacion.apply(x,y); //EJECUTA LA LAMBDA
	}

	public void setOperacion(BinaryOperator<Double> operacion) {
		this.operacion = operacion;
	}

}
