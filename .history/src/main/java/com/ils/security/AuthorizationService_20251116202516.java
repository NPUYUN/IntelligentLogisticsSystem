package com.ils.security;

import com.ils.auth.User;

public interface AuthorizationService {
    boolean hasPermission(User user, String permission);
}