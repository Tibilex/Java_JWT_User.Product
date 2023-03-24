package com.example.JWT.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String mail;

    public String getPassword() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setPassword(String mail) {
        this.mail = mail;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
