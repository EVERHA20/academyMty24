package com.curso.v10;

public class Division extends Operacion {
	
	Division(int x,int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x / y;
	}

}
