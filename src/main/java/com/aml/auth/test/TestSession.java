package com.aml.auth.test;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TestSession {
    private LocalDateTime timestamp;
    private String user;
    private String token;
}
