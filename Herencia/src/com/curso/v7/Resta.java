package com.curso.v7;

public class Resta extends Operacion{
	
	Resta(int x,int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x - y;
	}
	
}
