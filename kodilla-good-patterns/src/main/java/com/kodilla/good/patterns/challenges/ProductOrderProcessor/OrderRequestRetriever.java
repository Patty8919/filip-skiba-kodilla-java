package com.kodilla.good.patterns.challenges.ProductOrderProcessor;


public class OrderRequestRetriever {
    private long orderId =1;
    private String userEmail = "kowalski@gmail.com";
    private long productId=2;

    public OrderRequest retrieveOrder(){
        return new OrderRequest(orderId,userEmail,productId);
    }
}
