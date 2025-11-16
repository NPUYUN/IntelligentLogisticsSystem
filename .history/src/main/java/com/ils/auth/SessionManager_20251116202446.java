package com.ils.auth;

public interface SessionManager {
    String startSession(User user);
    void endSession(String sessionId);
    User getUser(String sessionId);
}