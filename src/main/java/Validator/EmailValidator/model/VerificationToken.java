package Validator.EmailValidator.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class VerificationToken {

    public static final String STATUS_PENDING = "PENDING";
    public static final String  STATUS_VERIFIED = "VERIFIED";

    private Long id;
    private String token;
    private String status;
    private LocalDateTime expiredDateTime;
    private LocalDateTime issuedDateTime;
    private LocalDateTime configuredDateTime;

    public VerificationToken() {
        this.token = UUID.randomUUID().toString();
        this.issuedDateTime = LocalDateTime.now();
        this.expiredDateTime = this.issuedDateTime.plusDays(1);
        this.status = STATUS_PENDING;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setExpiredDateTime(LocalDateTime expiredDateTime) {
        this.expiredDateTime = expiredDateTime;
    }

    public LocalDateTime getExpiredDateTime() {
        return expiredDateTime;
    }

    public void setIssuedDateTime(LocalDateTime issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }

    public LocalDateTime getIssuedDateTime() {
        return issuedDateTime;
    }

    public void setConfiguredDateTime(LocalDateTime configuredDateTime) {
        this.configuredDateTime = configuredDateTime;
    }

    public LocalDateTime getConfiguredDateTime() {
        return configuredDateTime;
    }
}
