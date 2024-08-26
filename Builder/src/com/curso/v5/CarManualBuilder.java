package com.curso.v5;

public class CarManualBuilder implements Builder {
    
	private Manual manual;

    @Override
    public Tipo reset() {
        manual = new Manual();
        return manual;
    }

    @Override
    public Tipo setSeats(int number) {
        manual.addSection("Seats: " + number);
        return manual;
    }

    @Override
    public Tipo setEngine(Engine engine) {
        manual.addSection("Engine: " + engine.getDescription());
        return manual;
    }

    @Override
    public Tipo setTripComputer() {
        manual.addSection("Trip Computer: Installed");
        return manual;
    }

    @Override
    public Tipo setGPS() {
        manual.addSection("GPS: Installed");
        return manual;
    }

    @Override
    public Tipo getResult() {
        return this.manual;
    }
}

