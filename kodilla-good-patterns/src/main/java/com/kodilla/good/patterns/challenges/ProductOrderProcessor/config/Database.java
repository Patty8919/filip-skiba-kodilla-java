package com.kodilla.good.patterns.challenges.ProductOrderProcessor.config;

import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.Order;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.Product;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.User;

import java.util.ArrayList;

public class Database {
    ArrayList<Product> productDatabase = new ArrayList<>();
    ArrayList<User> userDatabase = new ArrayList<>();
    ArrayList<Order> orderDatabase = new ArrayList<>();

    public Database(){
        addSampleData();
    }

    public void addSampleData(){
        productDatabase.add(new Product(1,"Kapcie","Dom", 12.50));
        productDatabase.add(new Product(2,"TV32'", "Elektronika", 2500.00));

        userDatabase.add(new User(1,"Jan","Kowsalski", "02-754 Warszawa, ul.Gdańska 32", "kowalski@gmail.com","user123"));
        userDatabase.add(new User(2,"Adam","Nowak", "07-300 Gdańsk, ul.Warszawska 54", "nowak@gmail.com","user234"));
    }

    public void addProductToDatabase(Product product){
        productDatabase.add(product);
    }
    public void addUserToDatabase(User user){
        userDatabase.add(user);
    }
    public void addOrderToDatabase(Order order){
        orderDatabase.add(order);
    }

    public ArrayList<Product> getProductDatabase() {
        return productDatabase;
    }

    public void setProductDatabase(ArrayList<Product> productDatabase) {
        this.productDatabase = productDatabase;
    }

    public ArrayList<User> getUserDatabase() {
        return userDatabase;
    }

    public void setUserDatabase(ArrayList<User> userDatabase) {
        this.userDatabase = userDatabase;
    }

    public ArrayList<Order> getOrderDatabase() {
        return orderDatabase;
    }

    public void setOrderDatabase(ArrayList<Order> orderDatabase) {
        this.orderDatabase = orderDatabase;
    }
}
