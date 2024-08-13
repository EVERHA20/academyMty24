package com.curso.v2;

public class Principal {
	public static void main(String[] args) {
		System.out.println("V2");
		//USER1
		ConexionDB con1 = ConexionDB.getInstance();
		
		System.out.println(con1);
		
		//USER2
		ConexionDB con2 = ConexionDB.getInstance();
		
		//USER3
		ConexionDB con3 = ConexionDB.getInstance();
				
		//USER4
		ConexionDB con4 = ConexionDB.getInstance();
		
		//.............
		//USER9999
		ConexionDB con9999 = ConexionDB.getInstance();
		
		System.out.println("Contador: "+ConexionDB.getContador()); //1
		
	}
}
