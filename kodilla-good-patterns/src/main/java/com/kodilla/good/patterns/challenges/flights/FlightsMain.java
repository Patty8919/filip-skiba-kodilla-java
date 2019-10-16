package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.service.FindArrivals;
import com.kodilla.good.patterns.challenges.flights.service.FindDepartures;
import com.kodilla.good.patterns.challenges.flights.service.FindIndirectFlight;

public class FlightsMain {
    public static void main(String[] args) {
        FindArrivals findArrivals = new FindArrivals();
        FindDepartures findDepartures = new FindDepartures();
        FindIndirectFlight findIndirectFlight = new FindIndirectFlight();

        findArrivals.findAllFlights("Wrocław");
        findDepartures.findAllFlights("Gdańsk");
        findIndirectFlight.findIndirectConnections("Gdańsk","Kraków");

    }
}
