package com.kodilla.good.patterns.challenges.flights.service;

import com.kodilla.good.patterns.challenges.flights.model.Flight;

import java.util.List;

public interface FlightSearcher {
    List<Flight> findAllFlights(String city);


}
