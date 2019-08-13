package com.kodilla.good.patterns.challenges.food2door.model;

import java.util.Objects;

public class Distributor {

    private String distributorName;


    public Distributor(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distributor that = (Distributor) o;
        return Objects.equals(distributorName, that.distributorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distributorName);
    }
}
