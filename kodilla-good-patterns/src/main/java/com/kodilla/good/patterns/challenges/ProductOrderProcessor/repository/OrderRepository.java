package com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository;

import com.kodilla.good.patterns.challenges.ProductOrderProcessor.config.Database;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.Order;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.config.SimpleDAO;

import java.util.ArrayList;

public class OrderRepository implements SimpleDAO<Order> {

    private ArrayList<Order> orderDatabase = new Database().getOrderDatabase();

    public ArrayList<Order> getOrderDatabase() {
        return orderDatabase;
    }

    @Override
    public boolean save(Order order) {
        Order checkOrder = findById(order.getId());
        if (checkOrder == null) {
            orderDatabase.add(order);
            System.out.println("Order saved");
            return true;
        } else {
            System.out.println("Product with id : " + order.getId() + " already exists in database");
            return false;
        }
    }

    @Override
    public boolean delete(Order order) {
        for (Order o : orderDatabase) {
            if (o.getId()==order.getId()) {
                orderDatabase.remove(order);
                System.out.println("Order " + order.getId()+ " is deleted!");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Order order) {
        for (Order o : orderDatabase) {
            if (o.getId()==order.getId()) {
                o.setProduct(order.getProduct());
                o.setUser(order.getUser());
                System.out.println("Product " + order.toString() + "updated!");
                return true;
            }
        }
        return false;
    }

    @Override
    public Order findByPropertyName(String propertyName) {
       return null;
    }

    @Override
    public Order findById(long id) {
        Order order = null;
        for (Order o : orderDatabase) {
            if (o.getId()==id)
                order = o;
        }
        return order;
    }
}
