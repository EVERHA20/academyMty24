package com.curso.v4;

public class Car {
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(GPS gps) {
        this.gps = gps;
    }

	@Override
	public String toString() {
		return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps + "]";
	}
    
    
}

class Manual {
    private StringBuilder content = new StringBuilder();

    public void addSection(String section) {
        content.append(section).append("\n");
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

class Engine {
    public String getDescription() {
        return "V8 Engine";
    }
}

class TripComputer { }

class GPS { }

