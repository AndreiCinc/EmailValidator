package Validator.EmailValidator.model;

public class Email {

    private String email;
    private Long id;
    private Boolean isActive;
    private VerificationToken verificationToken;

    public Email(String email, Long id, Boolean isActive) {
        this.email = email;
        this.id = id;
        this.isActive = isActive;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public VerificationToken getVerificationToken() {
        return verificationToken;
    }

    public void VerificationToken(VerificationToken verificationToken) {
        this.verificationToken = verificationToken;
    }
}
