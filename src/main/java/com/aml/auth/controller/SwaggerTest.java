package com.aml.auth.controller;

import com.aml.auth.model.Login;
import com.aml.auth.model.Session;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("swagger")
public class SwaggerTest {
    @PostMapping("login")
    public Session post(@RequestBody Login login){
        Session session = new Session();
        session.setTimestamp(LocalDateTime.now());
        session.setUser(login.getUsername());
        session.setToken(UUID.randomUUID().toString());
        return session;
    }
}
