package com.curso.v9;

public class Multi extends Operacion{
	
	Multi(int x,int y){
		super(x,y);
	}

	@Override
	int ejecuta(){
		return x * y;
	}
	
}
