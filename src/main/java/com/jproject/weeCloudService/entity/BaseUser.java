package com.jproject.weeCloudService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter @Getter
public class BaseUser {

    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;


}
