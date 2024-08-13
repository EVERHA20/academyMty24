package com.curso.v1;

public class ConexionDB {
	
	private String name;
	private static int contador;
	
	private static ConexionDB conexion;

	private ConexionDB(String name) {
		this.name = name;
		++contador;
	}
	
	static public ConexionDB getInstance() {
		if (conexion == null)
			conexion = new ConexionDB("MySql");
		
		return conexion;
	}

	@Override
	public String toString() {
		return "ConexionDB [name=" + name + "]";
	}
	
	public static int getContador() {
		return contador;
	}

}
