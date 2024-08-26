package com.curso.v4;

public class CarBuilder implements Builder {
	
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer(new TripComputer());
    }

    @Override
    public void setGPS() {
        car.setGPS(new GPS());
    }

    public Car getResult() {
        return this.car;
    }
}
