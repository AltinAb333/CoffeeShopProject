package com.project.CoffeeShopProject.Services;

import com.project.CoffeeShopProject.Pojo.Coffee;
import com.project.CoffeeShopProject.Pojo.CoffeeType;
import com.project.CoffeeShopProject.Pojo.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    Orders findById(Integer id);
    Orders create(String name, Coffee coffee, CoffeeType coffeeType, Double totalPrice);

    Orders edit(Integer id, String text);
    void delete(Integer id);
}
