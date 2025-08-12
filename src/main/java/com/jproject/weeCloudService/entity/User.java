package com.jproject.weeCloudService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id @GeneratedValue
    private String id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

}
