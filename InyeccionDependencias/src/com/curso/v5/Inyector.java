package com.curso.v5;

public class Inyector {
	
	static Computadora compuWin = new CompuWindows("XP");
	static Computadora compuLin = new CompuLinux("Ubuntu 18");
	static Computadora compuMac = new CompuMac("Sierra");

	static void inyectarComputadora(Becario bec,TipoCompu tipo){
		
		switch(tipo) {
		case WINDOWS: 
			bec.setCompu(compuWin);
			break;
		case LINUX:
			bec.setCompu(compuLin);
			break;
		case MAC:
			bec.setCompu(compuMac);
			break;
		default:
			throw new UnsupportedOperationException("Tipo Computadora no existe");
		}
			
	}


}
