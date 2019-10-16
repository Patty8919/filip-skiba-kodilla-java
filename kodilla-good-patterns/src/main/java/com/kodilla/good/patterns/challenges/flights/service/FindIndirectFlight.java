package com.kodilla.good.patterns.challenges.flights.service;

import com.kodilla.good.patterns.challenges.flights.model.Connections;
import com.kodilla.good.patterns.challenges.flights.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FindIndirectFlight {
    private Connections connections = new Connections();
    private FindArrivals findArrivals = new FindArrivals();
    private List<Flight> possibleFlights = new ArrayList<>();

    public void findIndirectConnections(String departureCity, String arrivalCity) {
        findArrivals.findAllFlights(arrivalCity).stream()
                .map(d -> d.getDeparture())
                .forEach(d -> findConnection(departureCity, d));
        printIndirectPoints(departureCity, arrivalCity);
    }

    public void printIndirectPoints(String departureCity, String arrivalCity) {
        System.out.println("Znalezione loty pośrednie do miasta: " + arrivalCity);
        possibleFlights.stream()
                .forEach(d -> System.out.println("Lot z miasta " + departureCity + " przez miasto " + d.getArrival() + " do miasta " + arrivalCity));
    }

    public void findConnection(String departureCity, String arrivalCity) {
        connections.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(departureCity) && flight.getArrival().equals(arrivalCity))
                .forEach(f -> possibleFlights.add(f));
    }
}
