package com.curso.v0;

public class Suma extends Object {
	
	//VARIABLES DE INSTANCIA
	int x; //0
	int y; //0
	
	//OVERLOADING(SOBRECARGA) DE CONSTRUCTORES
	
	Suma(){
		System.out.println("PASO POR EL CONSTRUCTOR DEFAULT");
	}
	
	Suma(int w){
		super();
		x = w;
	}
	
	Suma(int w,int z){
		super();
		x = w;
		y = z;
	}

}
