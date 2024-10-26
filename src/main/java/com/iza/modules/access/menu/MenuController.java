package com.iza.modules.access.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menus")
public class MenuController {
    @Autowired
    private MenuService service;
    @GetMapping
    public List<MenuResponse> menus(){
        return service.menu();
    }
}
