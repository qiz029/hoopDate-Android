package com.hoop.date.hoopdate.model;

public class credential {
    private String email;
    private String password;
    public credential() {
        this.email = "";
        this.password = "";
    }

    public credential(String userEmail, String userPassword) {
        this.email = userEmail;
        this.password = userPassword;
    }

    public void setEmail(String userEmail) {
        this.email = userEmail;
    }

    public void setPassword(String userPassword) {
        this.password = userPassword;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}
