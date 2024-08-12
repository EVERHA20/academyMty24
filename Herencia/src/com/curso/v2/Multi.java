package com.curso.v2;

public class Multi{
	
	//VARIABLES DE INSTANCIA
	int x; //0
	int y; //0
	
	Multi(int x,int y){
		this.x = x;
		this.y = y;
	}

	int ejecuta(){
		return x * y;
	}
	
	@Override //(SOBREESCRITURA)
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}
	
}
