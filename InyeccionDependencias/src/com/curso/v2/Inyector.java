package com.curso.v2;

public class Inyector {
	
	static Computadora compuWin = new CompuWindows("XP");
	static Computadora compuLin = new CompuLinux("Ubuntu 18");
	
	static void inyectarComputadora(Becario bec,String tipo){
		
		if (tipo == "Win")
			bec.compu = compuWin;
		else if (tipo == "Lin")
			bec.compu = compuLin;
		else 
			throw new UnsupportedOperationException("Tipo Computadora no existe");
	}


}
