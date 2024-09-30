package com.aml.auth.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Session {
    private LocalDateTime timestamp;
    private String user;
    private String token;
}
