package com.kodilla.good.patterns.challenges.ProductOrderProcessor;

public class ProductOrderDto {
    private String userName;
    private String productName;
    private long orderId;
    private boolean orderAccepted;

    public ProductOrderDto(String userName, String productName, long orderId, boolean orderExists) {
        this.userName = userName;
        this.productName = productName;
        this.orderId = orderId;
        this.orderAccepted = orderExists;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public boolean isOrderExists() {
        return orderAccepted;
    }

    public void setOrderExists(boolean orderExists) {
        this.orderAccepted = orderExists;
    }

    @Override
    public String toString() {
        return "ProductOrderDto{" +
                "userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", orderId=" + orderId +
                ", orderAccepted=" + orderAccepted +
                '}';
    }
}
