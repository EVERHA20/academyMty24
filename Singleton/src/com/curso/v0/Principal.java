package com.curso.v0;

public class Principal {
	public static void main(String[] args) {
		//USER1
		ConexionDB con1 = new ConexionDB("MySql");
		
		//USER2
		ConexionDB con2 = new ConexionDB("MySql");
		
		//USER3
		ConexionDB con3 = new ConexionDB("MySql");
				
		//USER4
		ConexionDB con4 = new ConexionDB("MySql");
		
		//.............
		//USER9999
		ConexionDB con9999 = new ConexionDB("MySql");
		
		System.out.println("Contador: "+ConexionDB.getContador());
		
	}
}
