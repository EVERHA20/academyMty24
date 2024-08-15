package com.curso.v1;

public class PricipalClient1 {

	public static void main(String[] args) {

		Estudiante e = new Estudiante("Patrobas",20);
		
		e.edad = 18; //<=No se recomienda
		
		System.out.println(e);
		
	}

}
