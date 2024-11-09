package com.zhm.response;

import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private boolean sattus;
    private String message;
    private boolean isTwoFactorAuthEnabled;
    private String session;
}
