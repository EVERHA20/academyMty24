package com.curso.v7;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V6");
		Becario bec1 = Inyector.inyectarComputadora("Patrobas",TipoCompu.LINUX);
		bec1.elaborarPrograma();
		
		Becario bec2 = Inyector.inyectarComputadora("Andronico",TipoCompu.WINDOWS);
		bec2.elaborarPrograma();
		
		Becario bec3 = Inyector.inyectarComputadora("Epeneto",TipoCompu.MAC);
		bec3.elaborarPrograma();
		
		Becario bec4 = Inyector.inyectarComputadora("Tercio",TipoCompu.LINUX);
		bec4.elaborarPrograma();
		
		
		if (bec1.getCompu() == bec4.getCompu())
			System.out.println("MISMO OBJETO");
		
	}

}
