package com.iza.auth.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class MenuService {
    @Autowired
    private MenuRepository repository;
    public List<MenuEntity> menu(){
        List<MenuEntity> list = repository.findAllByOrderByLevelAsc();
        Map<Integer, MenuEntity> map = list.stream().collect(Collectors.toMap(MenuEntity::getId, Function.identity()));
        Map<Integer, MenuEntity> treeMenu= new LinkedHashMap<>();
        for(MenuEntity menu:list){
            if(menu.getParent()==null)
                treeMenu.put(menu.getId(), menu);
            else{
                map.get(menu.getParent()).add(menu);
            }
        }
        list=treeMenu.values().stream().filter(m->m.getMenus().size()>0).collect(Collectors.toList());
        //list  =new ArrayList<>(treeMenu.values());
        return list;
    }
}
