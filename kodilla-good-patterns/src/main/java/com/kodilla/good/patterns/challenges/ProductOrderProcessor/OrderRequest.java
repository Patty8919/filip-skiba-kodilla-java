package com.kodilla.good.patterns.challenges.ProductOrderProcessor;

public class OrderRequest {
    private long orderId;
    private String user;
    private long productId;

    public OrderRequest(long orderId,String user, long productId) {
        this.orderId=orderId;
        this.user = user;
        this.productId = productId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }
}
