package com.ils.reporting;

public interface ReportingService {
    Report generateOrdersReport();
    Report generateLogisticsCostReport();
    Report generateEfficiencyReport();
}