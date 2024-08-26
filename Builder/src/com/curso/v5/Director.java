package com.curso.v5;

public class Director {
    
    public void makeSUV(Builder builder) {
        builder.reset()
        .setSeats(5)
        .setEngine(new SUVEngine())
        .setTripComputer()
        .setGPS();
    }

    public void makeSportsCar(Builder builder) {
    	builder.reset()
        .setSeats(2)
        .setEngine(new SportEngine())
        .setTripComputer()
        .setGPS();
    }
}

class SUVEngine extends Engine {
    @Override
    public String getDescription() {
        return "SUV Engine";
    }
}

class SportEngine extends Engine {
    @Override
    public String getDescription() {
        return "Sport Engine";
    }
}

