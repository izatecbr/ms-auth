package com.iza.auth.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MenuRepository extends JpaRepository <MenuEntity, Integer> {
    //List<MenuEntity> findAllByOrderByLevelAsc();
    @Transactional(readOnly = true)
    @Query(value = "SELECT new com.iza.auth.menu.MenuResponse(a.id, a.label, a.parent) FROM MenuEntity a")
    List<MenuResponse> getMenus();
}
