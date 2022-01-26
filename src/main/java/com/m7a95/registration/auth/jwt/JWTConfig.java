package com.m7a95.registration.auth.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application.jwt")
public class JWTConfig {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpirationAfterMinutes;
    private Integer refreshTokenExpirationAfterMinutes;

    public JWTConfig() {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public Integer getTokenExpirationAfterMinutes() {
        return tokenExpirationAfterMinutes;
    }

    public void setTokenExpirationAfterMinutes(Integer tokenExpirationAfterMinutes) {
        this.tokenExpirationAfterMinutes = tokenExpirationAfterMinutes;
    }

    public Integer getRefreshTokenExpirationAfterMinutes() {
        return refreshTokenExpirationAfterMinutes;
    }

    public void setRefreshTokenExpirationAfterMinutes(Integer refreshTokenExpirationAfterMinutes) {
        this.refreshTokenExpirationAfterMinutes = refreshTokenExpirationAfterMinutes;
    }

    public String getAuthorizationHeader() {
        return HttpHeaders.AUTHORIZATION;
    }
}
