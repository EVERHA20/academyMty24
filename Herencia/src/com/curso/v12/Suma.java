package com.curso.v12;

public class Suma implements Operacion{
	
	int x; 
	int y; 
	
	Suma(int x,int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return x+y;
	}
	
	public double ejecuta(double a, double b) {
		return a + b;
	}
	
	@Override 
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

}
