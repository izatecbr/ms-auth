package com.iza.modules.access.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MenuRepository extends JpaRepository <MenuEntity, Integer> {
    //List<MenuEntity> findAllByOrderByLevelAsc();
    @Transactional(readOnly = true)
    @Query(value = "SELECT new com.iza.access.menu.MenuResponse(a.id, a.label, a.parent) FROM MenuEntity a")
    List<MenuResponse> getMenus();
}
