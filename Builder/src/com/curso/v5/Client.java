package com.curso.v5;

public class Client {
	
	//PENDIENTE DE SOLUCIONAR
    public static void main(String[] args) {
        Director director = new Director();
        
        // Creación de un coche deportivo
        Builder builder = new CarBuilder();
        
        director.makeSportsCar(builder);
        
        Tipo car = builder.getResult();
        
        System.out.println("Car built: " + car);
    }
}
