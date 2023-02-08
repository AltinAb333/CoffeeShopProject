package com.project.CoffeeShopProject.Services;

import com.project.CoffeeShopProject.Pojo.Coffee;
import com.project.CoffeeShopProject.Pojo.CoffeeType;

import java.util.List;

public interface CoffeeService {
    List<Coffee> findAll();
    Coffee findById(Integer id);

    Coffee create(String name, Double price, CoffeeType coffeeType);

    Coffee edit(Integer id, String name, Double price, CoffeeType coffeeType);

    void delete(Integer id);
}
