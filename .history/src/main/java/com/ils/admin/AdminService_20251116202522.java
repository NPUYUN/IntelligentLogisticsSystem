package com.ils.admin;

import com.ils.auth.User;

public interface AdminService {
    void createUser(User user);
    void assignRole(String userId, String role);
}