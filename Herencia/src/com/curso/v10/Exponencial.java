package com.curso.v10;

public class Exponencial extends Operacion{
	
	Exponencial(int x,int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return (int)Math.pow(x, y);
	}

}
