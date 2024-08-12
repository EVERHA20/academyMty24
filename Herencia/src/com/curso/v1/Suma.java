package com.curso.v1;

public class Suma extends Object{
	
	//VARIABLES DE INSTANCIA
	int x; //0
	int y; //0
	
	Suma(int x,int y){
		this.x = x;
		this.y = y;
	}

	@Override //(SOBREESCRITURA)
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}
	
}
