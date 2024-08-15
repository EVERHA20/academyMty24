package com.curso.v3;

public class Inyector {
	
	static Computadora compuWin = new CompuWindows("XP");
	static Computadora compuLin = new CompuLinux("Ubuntu 18");
	static Computadora compuMac = new CompuMac("Sierra");

	
	static void inyectarComputadora(Becario bec,String tipo){
		
		if (tipo == "Win")
			bec.setCompu(compuWin);
		else if (tipo == "Lin")
			bec.setCompu(compuLin);
		else if (tipo == "Mac")
			bec.setCompu(compuMac);
		else 
			throw new UnsupportedOperationException("Tipo Computadora no existe");
	}


}
