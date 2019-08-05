package com.kodilla.good.patterns.challenges.flights.model;

public final class DirectPoints {
    private final String point;
    private final Flight flight;

    public DirectPoints(final String point,final Flight flight) {
        this.point = point;
        this.flight = flight;
    }

    public String getPoint() {
        return point;
    }


}
