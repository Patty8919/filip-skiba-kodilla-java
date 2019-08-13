package com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository;

import com.kodilla.good.patterns.challenges.ProductOrderProcessor.config.Database;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.Product;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.config.SimpleDAO;

import java.util.ArrayList;

public class ProductRepository implements SimpleDAO<Product> {

    ArrayList<Product> productsDatabase = new Database().getProductDatabase();


    @Override
    public boolean save(Product product) {

        Product checkProduct = findById(product.getId());
        if (checkProduct == null) {
            productsDatabase.add(product);
            return true;
        } else {
            System.out.println("Product with id : " + product.getId() + " already exists in database");
            return false;
        }
    }

    @Override
    public boolean delete(Product product) {
        for (Product p : productsDatabase) {
            if (p.getId() == product.getId()) {
                productsDatabase.remove(product);
                System.out.println("Product " + product.getProductName() + " is deleted!");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Product product) {
        for (Product p : productsDatabase) {
            if (p.getId() == product.getId()) {
                p.setProductName(product.getProductName());
                p.setCategory(product.getCategory());
                p.setPrize(product.getPrize());
                System.out.println("Product " + product.toString() + "updated!");
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findByPropertyName(String productName) {
        Product product = null;
        for (Product p : productsDatabase) {
            if (p.getProductName().equals(productName))
                product = p;
        }
        return product;
    }

    @Override
    public Product findById(long id) {
        Product product = null;
        for (Product p : productsDatabase) {
            if (p.getId() == id)
                product = p;
        }
        return product;
    }

}
