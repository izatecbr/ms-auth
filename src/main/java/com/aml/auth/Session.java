package com.aml.auth;

import lombok.Data;

import java.util.List;

@Data
public class Session {
    private String login;
    private List<String> roles;
}
