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

    @GetMapping("/post")
    public List<Coffee> getAll() {
        return coffeeService.findAll();
    }
    @GetMapping("/post/{id}")
    public Coffee getOneById(@PathVariable Integer id) {
        return coffeeService.findById(id);
    }

    @PostMapping("/post")
    public Coffee create(@RequestBody String payload) {
        return coffeeService.create(payload);
    }

    @PutMapping("/post/{id}")
    public Coffee edit(@PathVariable Integer id,
                     @RequestBody EditInput input) {
        return coffeeService.edit(id, input.getText());
    }

    @DeleteMapping("/post/{id}")
    public void delete(@PathVariable Integer id) {
        coffeeService.delete(id);
    }

}
