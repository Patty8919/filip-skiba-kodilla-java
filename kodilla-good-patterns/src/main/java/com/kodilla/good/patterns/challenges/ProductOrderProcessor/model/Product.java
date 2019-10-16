package com.kodilla.good.patterns.challenges.ProductOrderProcessor.model;

import java.util.Objects;

public class Product {
    private long id;
    private String productName;
    private String category;
    private Double prize;

    public Product(long id, String productName, String category, Double prize) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.prize = prize;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(category, product.category) &&
                Objects.equals(prize, product.prize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, category, prize);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", prize=" + prize +
                '}';
    }
}
