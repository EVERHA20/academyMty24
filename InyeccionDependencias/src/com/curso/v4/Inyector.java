package com.curso.v4;

public class Inyector {
	
	static Computadora compuWin = new CompuWindows("XP");
	static Computadora compuLin = new CompuLinux("Ubuntu 18");
	static Computadora compuMac = new CompuMac("Sierra");

	
	static void inyectarComputadora(Becario bec,TipoCompu tipo){
		
		if (tipo == TipoCompu.WINDOWS)
			bec.setCompu(compuWin);
		else if (tipo == TipoCompu.LINUX)
			bec.setCompu(compuLin);
		else if (tipo == TipoCompu.MAC)
			bec.setCompu(compuMac);
		else 
			throw new UnsupportedOperationException("Tipo Computadora no existe");
	}


}
