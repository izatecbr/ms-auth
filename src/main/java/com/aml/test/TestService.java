package com.aml.test;

import com.aml.infra.business.LoginInvalidoException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class TestService {
    public TestSession login(TestLogin login){

        if(!login.getUsername().equals("admin") || !login.getPassword().equals("123"))
            throw new LoginInvalidoException();

        TestSession session = new TestSession();
        session.setTimestamp(LocalDateTime.now());
        session.setUser(login.getUsername());
        session.setToken(UUID.randomUUID().toString());

        return session;
    }
}
