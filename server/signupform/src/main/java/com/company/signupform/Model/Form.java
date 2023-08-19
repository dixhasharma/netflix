package com.company.signupform.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="signup")
public class Form {
    @Id
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="phoneno")
    private String phoneno;

    public Form() {
    }

    public Form(String email, String password, String phoneno) {
        this.email = email;
        this.password = password;
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}


