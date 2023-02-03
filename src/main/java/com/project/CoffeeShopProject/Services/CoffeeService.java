package com.project.CoffeeShopProject.Services;

import com.project.CoffeeShopProject.Pojo.Coffee;

import java.util.List;

public interface CoffeeService {
    List<Coffee> findAll();
    Coffee findById(Integer id);
    Coffee create(String text);
    Coffee edit(Integer id, String text);
    void delete(Integer id);
}
