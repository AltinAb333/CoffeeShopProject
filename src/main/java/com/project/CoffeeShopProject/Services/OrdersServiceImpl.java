package com.project.CoffeeShopProject.Services;

import com.project.CoffeeShopProject.Pojo.CoffeeType;
import com.project.CoffeeShopProject.Pojo.Orders;
import com.project.CoffeeShopProject.Repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    private OrdersRepo ordersRepo;

    @Override
    public List<Orders> findAll() {
        return ordersRepo.findAll();
    }

    @Override
    public Orders findById(Integer id) {
        return ordersRepo.findOrderById(id);
    }

    @Override
    public Orders create(String text) {
        Orders orders = new Orders();
        orders.setName(text);
        orders.setDate(new Date());
        orders.setType(CoffeeType.TEST);

        return ordersRepo.save(orders);
    }

    @Override
    public Orders edit(Integer id, String text) {
        Orders orders = ordersRepo.findOrderById(id);
        if (orders != null) {
            orders.setName(text);
            return ordersRepo.save(orders);
        }

        return null;
    }

    @Override
    public void delete(Integer id) {
        ordersRepo.deleteById(id);
    }
}
