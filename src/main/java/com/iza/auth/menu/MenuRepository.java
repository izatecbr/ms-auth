package com.iza.auth.menu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository <MenuEntity, Integer> {
    List<MenuEntity> findAllByOrderByLevelAsc();
}
