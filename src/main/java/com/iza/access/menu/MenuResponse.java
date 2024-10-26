package com.iza.access.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuResponse {
    private Integer id;
    private String label;
    private Integer parent;
    private List<MenuResponse> menus = new ArrayList<>();
    public MenuResponse(){}
    public MenuResponse(Integer id, String label, Integer parent){
        this.id = id;
        this.label = label;
        this.parent = parent;
    }
    public void add(MenuResponse menu){
        menus.add(menu);
    }
    public String getLabel() {
        return label;
    }

    public List<MenuResponse> getMenus() {
        return menus;
    }

    public Integer getId() {
        return id;
    }
    public Integer getParent() {
        return parent;
    }
}
