package com.curso.v9;

//NO SE PUEDEN CREAR OBJETOS DE TIPO OPERACION
public abstract class Operacion {

	int x; //0
	int y; //0
		
	Operacion(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	//Método sin comportamiento
	abstract int ejecuta();

	@Override 
	public String toString() {
		return  this.getClass().getSimpleName()+
				"[x=" + x + ", y=" + y + "]";
	}
}
