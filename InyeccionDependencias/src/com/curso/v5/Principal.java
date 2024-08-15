package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V5");
		Becario bec1 = new Becario("Patrobas");
		
		Inyector.inyectarComputadora(bec1,TipoCompu.LINUX);
		
		bec1.elaborarPrograma();
		
		Becario bec2 = new Becario("Andronico");
		
		Inyector.inyectarComputadora(bec2,TipoCompu.WINDOWS);
		
		bec2.elaborarPrograma();
		
		Inyector.inyectarComputadora(bec2,TipoCompu.LINUX);
		
		bec2.elaborarPrograma();
		
		Becario bec3 = new Becario("Epeneto");
		
		Inyector.inyectarComputadora(bec3,TipoCompu.MAC);
		
		bec3.elaborarPrograma();
		
	}

}
