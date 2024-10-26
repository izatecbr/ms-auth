package com.iza.access.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tab_user")
@Data
public class UserEntity {
    @Id
    private String login;
    private String password;
    private Integer profile;
}
