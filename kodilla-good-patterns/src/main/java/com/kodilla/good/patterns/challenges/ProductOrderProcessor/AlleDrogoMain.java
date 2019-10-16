package com.kodilla.good.patterns.challenges.ProductOrderProcessor;

import com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository.ProductRepository;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository.UserRepository;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.service.ProductOrderService;

public class AlleDrogoMain {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ProductOrderService productOrderService = new ProductOrderService(new ProductRepository(),new OrderRepository(),new UserRepository());
        System.out.println(productOrderService.process(orderRequestRetriever.retrieveOrder()));
        //Try to save same order
        System.out.println(productOrderService.process(orderRequestRetriever.retrieveOrder()));



    }
}
