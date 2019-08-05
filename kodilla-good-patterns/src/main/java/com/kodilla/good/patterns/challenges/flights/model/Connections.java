package com.kodilla.good.patterns.challenges.flights.model;

import java.util.ArrayList;

public final class Connections {
    private static final String city1 = "Gdańsk";
    private static final String city2 = "Warszawa";
    private static final String city3 = "Kraków";
    private static final String city4 = "Wrocław";
    private final ArrayList<Flight> list = new ArrayList<>();

    public Connections(){
        list.add(new Flight(1, city1, city2));
        list.add(new Flight(2, city3, city4));
        list.add(new Flight(2, city2, city3));
        list.add(new Flight(3, city4, city2));
        list.add(new Flight(4, city1, city4));
        list.add(new Flight(5, city4, city3));
    }

    public final ArrayList<Flight> getFlights() {
        return new ArrayList<Flight>(list);
    }
}
