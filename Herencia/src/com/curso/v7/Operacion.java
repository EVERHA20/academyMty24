package com.curso.v7;

public class Operacion {

	//VARIABLES DE INSTANCIA
	int x; //0
	int y; //0
	
	//Operacion(){} //NO LO NECESITO
	
	Operacion(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	int ejecuta(){
		return 0;
	}

	@Override 
	public String toString() {
		return  this.getClass().getSimpleName()+
				"[x=" + x + ", y=" + y + "]";
	}
}
