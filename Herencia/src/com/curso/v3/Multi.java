package com.curso.v3;

public class Multi extends Operacion{
	
	Multi(int x,int y){
		super(x,y);
	}

	@Override
	int ejecuta(){
		return x * y;
	}
	
	@Override //(SOBREESCRITURA)
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}
	
}
