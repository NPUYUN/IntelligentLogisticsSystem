package com.ils.auth;

public interface UserService {
    User create(User user);
    User getById(String userId);
    void disable(String userId);
}