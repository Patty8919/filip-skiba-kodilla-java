package com.kodilla.good.patterns.challenges.food2door.shop;

import com.kodilla.good.patterns.challenges.food2door.model.Distributor;
import com.kodilla.good.patterns.challenges.food2door.model.Order;
import com.kodilla.good.patterns.challenges.food2door.model.Product;
import com.kodilla.good.patterns.challenges.food2door.service.Distributors;

import java.util.HashMap;

public class ExtraFoodShop implements Distributors {
    private Distributor distributor = new Distributor("ExtraFoodShop");
    private HashMap<Integer, Product> products = new HashMap<>();

    public ExtraFoodShop() {
        this.products.put(1, new Product("Batonik białkowy", 5.0, this.distributor.getDistributorName()));
        this.products.put(2, new Product("Chleb dla diabetyków", 4.5, this.distributor.getDistributorName()));
    }

    @Override
    public boolean sendOrder(Order order) {
        if (order.getProduct().getProductDistributor().equals(this.distributor.getDistributorName())) {
            System.out.println("Order send to: " + this.distributor.getDistributorName());
            return true;
        } else {
            return false;
        }
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public HashMap<Integer, Product> getProducts() {
        return products;
    }
}
