package com.iza.auth.menu;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_menu")
@Data
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    private String label;
    private String level;
    private String role;
    private Integer parent;
    @Transient
    private List<MenuEntity> menus = new ArrayList();

    public void add(MenuEntity menu){
        menus.add(menu);
    }
}
