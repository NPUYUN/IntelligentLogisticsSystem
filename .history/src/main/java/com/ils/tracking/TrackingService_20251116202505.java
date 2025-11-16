package com.ils.tracking;

public interface TrackingService {
    void updateOrderTracking(String orderId, String status);
    String getOrderTracking(String orderId);
}