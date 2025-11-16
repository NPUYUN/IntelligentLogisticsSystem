package com.ils.delivery;

import com.ils.order.Order;

public interface DeliveryService {
    DeliveryTask createTask(Order order);
    void startDelivery(String taskId);
    void completeDelivery(String taskId);
    void updateStatus(String taskId, String status);
}