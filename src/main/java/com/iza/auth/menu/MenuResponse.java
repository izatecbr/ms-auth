package com.iza.auth.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuResponse {
    private String label;
    private List<MenuResponse> menus = new ArrayList<>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<MenuResponse> getMenus() {
        return menus;
    }
}
