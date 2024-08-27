package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Component component = new MesaBambu(
					new Protector(
					new Enfriador(
					new LapTop())));
		
		System.out.println(component.getNombrePrecio());
		System.out.println("CostoTotal: "+component.getCostoTotal());

	}

}
