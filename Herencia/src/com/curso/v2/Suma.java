package com.curso.v2;

public class Suma{
	
	//VARIABLES DE INSTANCIA
	int x; //0
	int y; //0
	
	Suma(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	int ejecuta(){
		return x + y;
	}

	@Override //(SOBREESCRITURA)
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}
	
}
