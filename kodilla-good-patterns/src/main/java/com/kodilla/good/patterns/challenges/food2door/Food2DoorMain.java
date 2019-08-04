package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.model.Order;
import com.kodilla.good.patterns.challenges.food2door.shop.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.service.OrderProductService;
import com.kodilla.good.patterns.challenges.food2door.shop.GlutenFreeShop;

public class Food2DoorMain {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        Order order = new Order(extraFoodShop.getProducts().get(1), 15.0);
        Order order2 = new Order(glutenFreeShop.getProducts().get(1), 35.0);

        OrderProductService orderProductService1 = new OrderProductService(extraFoodShop);
        OrderProductService orderProductService2 = new OrderProductService(glutenFreeShop);
        orderProductService1.sendOrder(order);
        orderProductService2.sendOrder(order2);
    }

}
