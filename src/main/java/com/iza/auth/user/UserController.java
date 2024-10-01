package com.iza.auth.user;

import com.iza.auth.Session;
import com.iza.infra.http.Response;
import com.iza.infra.http.ResponseFactory;
import com.iza.test.TestLogin;
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
