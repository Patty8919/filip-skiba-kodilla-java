package com.kodilla.good.patterns.challenges.food2door.model;

import java.util.Objects;

public class Product {
    private String productName;
    private double prize;
    private String productDistributor;

    public Product(String productName, double prize, String productDistributor) {
        this.productName = productName;
        this.prize = prize;
        this.productDistributor = productDistributor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getProductDistributor() {
        return productDistributor;
    }

    public void setProductDistributor(String productDistributor) {
        this.productDistributor = productDistributor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.prize, prize) == 0 &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productDistributor, product.productDistributor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, prize, productDistributor);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", prize=" + prize +
                ", productDistributor='" + productDistributor + '\'' +
                '}';
    }
}
