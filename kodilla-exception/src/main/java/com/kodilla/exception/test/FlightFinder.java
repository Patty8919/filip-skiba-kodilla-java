package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException{
        HashMap<String,Boolean> airports = new HashMap<>();
        airports.put("Warszawa Okęcie (WAW)", true);
        airports.put("Kraków Balice (KRK)",false);
        airports.put("Gdańsk Rębiechowo (GDN)", true);

        if (airports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Choosed airport exists");
        }

        else{
            throw new RouteNotFoundException("Can not find choosed airport");
        }
    }
    public static void main(String[] args) {
        Flight flight = new Flight("Warszawa Okęcie (WAW)", "Kraków Balice (KRK)");
        Flight error = new Flight("Poznań Ławica (POZ)", "Wrocław (WRO)");
        FlightFinder flightFinder = new FlightFinder();

        System.out.println("*********************************");
        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Processing other logic");
        }
        System.out.println("*********************************");
        try {
            flightFinder.findFilght(error);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Processing other logic");
        }
        System.out.println("*********************************");
    }
}
