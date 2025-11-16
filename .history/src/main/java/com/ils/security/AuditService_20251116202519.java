package com.ils.security;

public interface AuditService {
    void record(AuditLog log);
}