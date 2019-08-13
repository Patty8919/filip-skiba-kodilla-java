package com.kodilla.good.patterns.challenges.flights.service;

import com.kodilla.good.patterns.challenges.flights.model.Connections;
import com.kodilla.good.patterns.challenges.flights.model.Flight;

import java.util.List;
import java.util.stream.Collectors;

public class FindDepartures implements FlightSearcher {
    private Connections connections = new Connections();

    @Override
    public List<Flight> findAllFlights(String city) {
        System.out.println("Wszystkie wyloty z miasta "+city);
        List<Flight> flights = connections.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(city))
                .collect(Collectors.toList());
        flights.stream().forEach(s-> System.out.println(s));
        return flights;
    }

    }



