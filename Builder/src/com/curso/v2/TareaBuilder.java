package com.curso.v2;

public class TareaBuilder {
	
	public static void main(String[] args) {
		
		Tarea tarea = new Tarea.TareaBuilder(20)
				.setTarea("Comprar leche")
				.setDefinidaPor("Epeneto")
				.setAsignadaA("Andronico")
				.build();
		
		System.out.println(tarea);
	}

}
