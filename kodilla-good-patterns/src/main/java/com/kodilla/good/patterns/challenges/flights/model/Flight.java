package com.kodilla.good.patterns.challenges.flights.model;

import java.util.Objects;

public final class Flight {
    private final int id;
    private final String departure;
    private final String arrival;

    public Flight(final int id, final String departure, final String arrival) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }


    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id == flight.id &&
                Objects.equals(departure, flight.departure) &&
                Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                " wylot z miasta: '" + departure + '\'' +
                " przylot do miasta '" + arrival + '\'' +
                '}';
    }
}
