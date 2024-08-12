package com.curso.v2;

public class Resta{
	
	//VARIABLES DE INSTANCIA
	int x; //0
	int y; //0
	
	Resta(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	int ejecuta(){
		return x - y;
	}

	@Override //(SOBREESCRITURA)
	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}
	
}
