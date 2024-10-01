package com.aml.auth.user;

import com.aml.auth.Session;
import com.aml.infra.http.Response;
import com.aml.infra.http.ResponseFactory;
import com.aml.test.TestLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("login")
    public Response login(@RequestBody TestLogin login){
        Session session = service.login(login.getUsername());
        return ResponseFactory.ok(session,"Login com perfil de acesso realizado com sucesso");
    }
}
