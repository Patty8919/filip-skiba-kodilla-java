package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.model.Order;


public class OrderProductService {
    private final Distributors distributorsService;

    public OrderProductService(final Distributors distributorsService) {
        this.distributorsService = distributorsService;
    }

    public void sendOrder(Order order) {
        if (distributorsService.sendOrder(order)) {
            System.out.println("Sending success");
        } else {
            System.out.println("Can not send order");
        }
    }

}
