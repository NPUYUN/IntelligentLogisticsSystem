package Orders;

import com.ils.auth.Customer;
import com.ils.auth.LogisticsManager;
import com.ils.delivery.DeliveryTask;

import java.util.List;

/**
 * 订单类
 */
public class Order {
    private Customer customer;
    private LogisticsManager logisticsManager;
    private List<OrderItem> orderItems;
    private DeliveryTask deliveryTask;
    
    // 类实现将在后续完成
}