package com.curso.v5;

public class CarBuilder implements Builder {
	
    private Car car;

    @Override
    public Tipo reset() {
        car = new Car();
        return car;
    }

    @Override
    public Tipo setSeats(int number) {
        car.setSeats(number);
        return car;
    }

    @Override
    public Tipo setEngine(Engine engine) {
        car.setEngine(engine);
        return car;
    }

    @Override
    public Tipo setTripComputer() {
        car.setTripComputer(new TripComputer());
        return car;
    }

    @Override
    public Tipo setGPS() {
        car.setGPS(new GPS());
        return car;
    }

    @Override
    public Tipo getResult() {
        return this.car;
    }
}
