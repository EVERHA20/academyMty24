package com.curso.v5;

public class Car implements Tipo {
    private int seats;
    private Engine engine;
    private TripComputer tripComputer;
    private GPS gps;

    @Override
    public Tipo setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Tipo setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Tipo setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public Tipo setGPS(GPS gps) {
        this.gps = gps;
        return this;
    }

	@Override
	public String toString() {
		return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps + "]";
	}
    
    
}

class Manual implements Tipo {
    private StringBuilder content = new StringBuilder();

    public void addSection(String section) {
        content.append(section).append("\n");
    }

    @Override
    public String toString() {
        return content.toString();
    }

	@Override
	public Tipo setSeats(int number) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Tipo setEngine(Engine engine) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Tipo setTripComputer(TripComputer tripComputer) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Tipo setGPS(GPS gps) {
		// TODO Auto-generated method stub
		return null;
	}


}

class Engine {
    public String getDescription() {
        return "V8 Engine";
    }
}

class TripComputer { }

class GPS { }

