package com.ils.order;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrder(String orderId);
    void cancelOrder(String orderId);
    void updateOrderStatus(String orderId, OrderStatus status);
}