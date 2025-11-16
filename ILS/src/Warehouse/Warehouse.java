package Warehouse;

import com.ils.auth.WarehouseManager;
import com.ils.orders.Order;

import java.util.List;

/**
 * 仓库类
 */
public class Warehouse {
    private String id;
    private String name;
    private String location;
    private WarehouseManager warehouseManager;
    private List<Inventory> inventories;
    private List<Order> orders;
    
    // 类实现将在后续完成
}