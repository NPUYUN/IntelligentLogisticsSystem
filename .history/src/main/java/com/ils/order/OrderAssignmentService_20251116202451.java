package com.ils.order;

import com.ils.warehouse.Warehouse;

public interface OrderAssignmentService {
    void assignToWarehouse(String orderId, Warehouse warehouse);
    void assignToCourier(String orderId, String courierId);
}