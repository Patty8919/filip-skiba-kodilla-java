package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal people;
    private final String countryName;

    public Country(final BigDecimal people, final String countryName) {
        this.people = people;
        this.countryName=countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "Country{" +
                "people=" + people +
                '}';
    }

    public BigDecimal getPeopleQuantity(){
        return this.people;
    }
}
