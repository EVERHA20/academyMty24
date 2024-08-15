package com.curso.v7;

public class Inyector {

	static Becario inyectarComputadora(String nombre,TipoCompu tipo){
		
		switch(tipo) {
		case WINDOWS: 
			return new Becario(nombre,new CompuWindows("XP"));
		case LINUX:
			return new Becario(nombre,new CompuLinux("Ubuntu 18"));
		case MAC:
			return new Becario(nombre,new CompuMac("Sierra"));
		default:
			throw new UnsupportedOperationException("Tipo Computadora no existe");
		}
			
	}


}
