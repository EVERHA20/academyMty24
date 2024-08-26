package com.curso.v4;

public class Director {
    
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine(new SUVEngine());
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer();
        builder.setGPS();
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

