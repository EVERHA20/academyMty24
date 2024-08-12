package com.curso.v7;

public class Division extends Operacion {
	
	Division(int x,int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x / y;
	}

}
