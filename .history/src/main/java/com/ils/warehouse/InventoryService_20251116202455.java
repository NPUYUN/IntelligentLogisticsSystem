package com.ils.warehouse;

public interface InventoryService {
    void addProduct(Product product);
    void removeProduct(String productId);
    void updateStock(String productId, int delta);
    int getStock(String productId);
    void setReplenishmentThreshold(String productId, int threshold);
}