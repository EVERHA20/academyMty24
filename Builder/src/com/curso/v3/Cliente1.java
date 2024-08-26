package com.curso.v3;

public class Cliente1 {
	
	public static void main(String[] args) {
		
		Tarea.TareaBuilder
				.setId(20);
		
		Tarea.TareaBuilder
				.setTarea("Comprar leche");
		
		Tarea.TareaBuilder
				.setDefinidaPor("Epeneto");
		
		Tarea.TareaBuilder
				.setAsignadaA("Andronico");
		
		Tarea tarea = Tarea.TareaBuilder.build();
		
		System.out.println(tarea);
	}

}