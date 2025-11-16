package com.ils.warehouse;

public interface InventoryGateway {
    void importInventory(byte[] data);
    byte[] exportInventory();
}