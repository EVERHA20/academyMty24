package com.curso.v10;

public class Exponencial implements Operacion{
	
	int x; 
	int y; 
	
	Exponencial(int x,int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int ejecuta() {
		return (int)Math.pow(x, y);	
	}
	
	@Override 
	public String toString() {
		return "Exponencial [x=" + x + ", y=" + y + "]";
	}

}
