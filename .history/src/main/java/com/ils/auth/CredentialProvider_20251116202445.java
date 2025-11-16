package com.ils.auth;

public interface CredentialProvider {
    Credential createCredential(String identifier, String secret);
    boolean verify(Credential credential, String secret);
}