package com.project.CoffeeShopProject.Controller;


import com.project.CoffeeShopProject.Pojo.EditInput;
import com.project.CoffeeShopProject.Pojo.Orders;
import com.project.CoffeeShopProject.Services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrdersService ordersService;

    @GetMapping("/orders")
    public List<Orders> getAll() {
        return ordersService.findAll();
    }
    @GetMapping("/orders/{id}")
    public Orders getOneById(@PathVariable Integer id) {
        return ordersService.findById(id);
    }

    @PostMapping("/orders")
    public Orders create(@RequestBody Orders orders) {
        return ordersService.create(orders.getName(), orders.getCoffee(), orders.getType(), orders.getTotalPrice());
    }

    @PutMapping("/orders/{id}")
    public Orders edit(@PathVariable Integer id,
                       @RequestBody EditInput input) {
        return ordersService.edit(id, input.getText());
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable Integer id) {
        ordersService.delete(id);
    }

}
