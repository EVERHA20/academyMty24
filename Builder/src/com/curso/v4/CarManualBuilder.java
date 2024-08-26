package com.curso.v4;

public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.addSection("Seats: " + number);
    }

    @Override
    public void setEngine(Engine engine) {
        manual.addSection("Engine: " + engine.getDescription());
    }

    @Override
    public void setTripComputer() {
        manual.addSection("Trip Computer: Installed");
    }

    @Override
    public void setGPS() {
        manual.addSection("GPS: Installed");
    }

    public Manual getResult() {
        return this.manual;
    }
}

