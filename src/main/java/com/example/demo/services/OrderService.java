package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Order;

public interface OrderService {
    List<Order> findAllOrderByCustomerUserName(String customerUserName);
    Order saveOrder(Order order);
    void deleteOrderById(Long id);
    Optional<Order> getOrderById(Long id);
    List<Order> getAllOrders();
} 
