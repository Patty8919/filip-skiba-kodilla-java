package com.kodilla.good.patterns.challenges.food2door.shop;

import com.kodilla.good.patterns.challenges.food2door.model.Distributor;
import com.kodilla.good.patterns.challenges.food2door.model.Order;
import com.kodilla.good.patterns.challenges.food2door.model.Product;
import com.kodilla.good.patterns.challenges.food2door.service.Distributors;

import java.util.HashMap;

public class GlutenFreeShop implements Distributors {

    Distributor distributor = new Distributor("GlutenFreeShop");
    private HashMap<Integer, Product> products = new HashMap<>();

    public GlutenFreeShop() {
        this.products.put(1, new Product("Mąka owsiana bezglutenowa", 16.0, this.distributor.getDistributorName()));
        this.products.put(2, new Product("Chleb bezglutenowy jasny", 7.5, this.distributor.getDistributorName()));
    }

    @Override
    public boolean sendOrder(Order order) {
        if (order.getProduct().getProductDistributor().equals(this.distributor.getDistributorName())) {
            System.out.println("Order send to: " + this.distributor.getDistributorName());
            return true;
        } else {
            System.out.println("Wrong distributor: " +order.getProduct().getProductDistributor());
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
