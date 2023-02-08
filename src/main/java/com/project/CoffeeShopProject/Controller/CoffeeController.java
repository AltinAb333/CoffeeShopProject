package com.project.CoffeeShopProject.Controller;
import com.project.CoffeeShopProject.Pojo.Coffee;
import com.project.CoffeeShopProject.Pojo.EditInput;
import com.project.CoffeeShopProject.Services.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoffeeController {
    @Autowired
    CoffeeService coffeeService;

    @GetMapping("/coffee")
    public List<Coffee> getAll() {
        return coffeeService.findAll();
    }
    @GetMapping("/coffee/{id}")
    public Coffee getOneById(@PathVariable Integer id) {
        return coffeeService.findById(id);
    }

    @PostMapping("/coffee")
    public Coffee create(@RequestBody Coffee coffee) {
        return coffeeService.create(coffee.getName(), coffee.getPrice(), coffee.getType());
    }

    @PutMapping("/coffee/{id}")
    public Coffee edit(@PathVariable Integer id,
                     @RequestBody Coffee coffee) {
        return coffeeService.edit(id, coffee.getName(), coffee.getPrice(), coffee.getType());
    }

    @DeleteMapping("/coffee/{id}")
    public void delete(@PathVariable Integer id) {
        coffeeService.delete(id);
    }

}
