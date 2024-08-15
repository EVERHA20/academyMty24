package com.curso.v6;

public class Inyector {
	
	static Computadora compuWin = new CompuWindows("XP");
	static Computadora compuLin = new CompuLinux("Ubuntu 18");
	static Computadora compuMac = new CompuMac("Sierra");

	static Becario inyectarComputadora(String nombre,TipoCompu tipo){
		
		switch(tipo) {
		case WINDOWS: 
			return new Becario(nombre,compuWin);
		case LINUX:
			return new Becario(nombre,compuLin);
		case MAC:
			return new Becario(nombre,compuMac);
		default:
			throw new UnsupportedOperationException("Tipo Computadora no existe");
		}
			
	}


}
