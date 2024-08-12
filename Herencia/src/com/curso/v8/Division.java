package com.curso.v8;

public class Division extends Operacion {
	
	Division(int x,int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x / y;
	}

}
