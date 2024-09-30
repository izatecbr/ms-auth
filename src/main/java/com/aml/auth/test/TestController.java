package com.aml.auth.test;

import com.aml.auth.infra.http.Response;
import com.aml.auth.infra.http.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("swagger")
public class TestController {
    @Autowired
    private TestService service;
    @PostMapping("login")
    public Response post(@RequestBody TestLogin login){
        TestSession session = service.login(login);
        return ResponseFactory.ok(session,"Login realizado com sucesso");
    }
}
