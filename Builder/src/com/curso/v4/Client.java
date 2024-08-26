package com.curso.v4;

public class Client {
	
    public static void main(String[] args) {
        Director director = new Director();
        
        // Creación de un coche deportivo
        CarBuilder builder = new CarBuilder();
        
        director.makeSportsCar(builder);
        
        Car car = builder.getResult();
        
        System.out.println("Car built: " + car);
    }
}
