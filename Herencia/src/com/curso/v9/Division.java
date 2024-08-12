package com.curso.v9;

public class Division extends Operacion {
	
	Division(int x,int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x / y;
	}

}
