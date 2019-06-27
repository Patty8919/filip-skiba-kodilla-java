package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;


public final class Continent {
    private final String countinentName;
    private final List<Country> countryList = new ArrayList<Country>();

    public Continent(final String countinentName) {
        this.countinentName = countinentName;
    }

    public String getCountinentName() {
        return countinentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void addCountry(Country country){
        countryList.add(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countinentName='" + countinentName + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}