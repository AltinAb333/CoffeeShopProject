package com.project.CoffeeShopProject.Repository;

import com.project.CoffeeShopProject.Pojo.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepo extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();

    Orders findOrderById(Integer id);
}
