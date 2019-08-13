package com.kodilla.good.patterns.challenges.ProductOrderProcessor.service;

import com.kodilla.good.patterns.challenges.ProductOrderProcessor.OrderRequest;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.ProductOrderDto;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository.OrderRepository;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository.ProductRepository;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.repository.UserRepository;
import com.kodilla.good.patterns.challenges.ProductOrderProcessor.model.Order;

public class ProductOrderService {

    private ProductRepository productRepository;
    private OrderRepository orderRepository;
    private UserRepository userRepository;

    public ProductOrderService(final ProductRepository productRepository,
                               final OrderRepository orderRepository,
                               final UserRepository userRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public ProductOrderDto process(final OrderRequest orderRequest) {
        Order order = new Order(orderRequest.getOrderId(), userRepository.findByPropertyName(orderRequest.getUser()), productRepository.findById(orderRequest.getProductId()));
        if (orderRepository.save(order)) {
            return new ProductOrderDto(order.getUser().getEmail(), order.getProduct().getProductName(), order.getId(), true);
        } else {
            return new ProductOrderDto(order.getUser().getEmail(), order.getProduct().getProductName(), order.getId(), false);
        }
    }
}
