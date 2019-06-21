package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class World {

    private final List<Continent> continents = new ArrayList<Continent>();

    public void addContinents(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }

    public String getCountryList(){
        return continents.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getCountryName)
                .collect(Collectors.joining("\n"));


    }

}
