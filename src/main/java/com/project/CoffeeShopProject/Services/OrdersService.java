package com.project.CoffeeShopProject.Services;

import com.project.CoffeeShopProject.Pojo.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll();
    Orders findById(Integer id);
    Orders create(String text);
    Orders edit(Integer id, String text);
    void delete(Integer id);
}
