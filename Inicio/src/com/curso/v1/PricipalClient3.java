package com.curso.v1;

public class PricipalClient3 {

	public static void main(String[] args) {

		Estudiante e = new Estudiante("Epeneto",25);
		
		e.edad = -10; //<=No se recomienda
		
		System.out.println(e);
		
	}

}
