package com.ils.admin;

public interface MaintenanceService {
    SystemHealth checkHealth();
    void triggerAlert(String message);
}