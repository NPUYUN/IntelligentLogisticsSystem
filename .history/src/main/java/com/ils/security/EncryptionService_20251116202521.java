package com.ils.security;

public interface EncryptionService {
    byte[] encrypt(byte[] data);
    byte[] decrypt(byte[] data);
}