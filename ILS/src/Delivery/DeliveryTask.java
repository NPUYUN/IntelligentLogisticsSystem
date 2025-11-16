package Delivery;

import com.ils.auth.DeliveryPerson;
import com.ils.orders.Order;
import com.ils.tracking.TrackingService;

/**
 * 配送任务类
 */
public class DeliveryTask {
    private String id;
    private Order order;
    private DeliveryPerson deliveryPerson;
    private Route route;
    private TrackingService trackingService;
    private String status;
    
    // 类实现将在后续完成
}