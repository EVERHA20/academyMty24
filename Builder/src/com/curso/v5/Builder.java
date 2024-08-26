package com.curso.v5;

public interface Builder {
    Tipo reset();
    Tipo setSeats(int number);
    Tipo setEngine(Engine engine);
    Tipo setTripComputer();
    Tipo setGPS();
    Tipo getResult();
}
