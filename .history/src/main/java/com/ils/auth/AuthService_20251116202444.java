package com.ils.auth;

public interface AuthService {
    User register(User user, Credential credential);
    User login(String usernameOrPhone, Credential credential);
    void logout(String sessionId);
}