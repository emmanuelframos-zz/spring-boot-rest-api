package com.api.enums;

public class SecurityConstants {
    public static final String SECRET = "41c35840-e417-11e7-80c1-9a214cf093ae";
    public static final long EXPIRATION_TIME = 60000;
    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String REGISTER_URL = "/api/v1/users/register";
    public static final String AUTH_URL = "/api/v1/users/auth";
}