package com.project.CoffeeShopProject.Services;

import com.project.CoffeeShopProject.Pojo.Coffee;
import com.project.CoffeeShopProject.Pojo.CoffeeType;
import com.project.CoffeeShopProject.Repository.CoffeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    @Autowired
    private CoffeeRepo coffeeRepo;

    @Override
    public List<Coffee> findAll() {
        return coffeeRepo.findAll();
    }

    @Override
    public Coffee findById(Integer id) {
        return coffeeRepo.findCoffeeById(id);
    }

    @Override
    public Coffee create(String name, Double price, CoffeeType coffeeType) {
        Coffee coffee = new Coffee();
        coffee.setName(name);
        coffee.setPrice(price);
        coffee.setType(coffeeType);

        return coffeeRepo.save(coffee);
    }

    @Override
    public Coffee edit(Integer id, String name, Double price, CoffeeType coffeeType) {
        Coffee coffee = coffeeRepo.findCoffeeById(id);
        if (coffee != null) {
            coffee.setName(name);
            coffee.setPrice(price);
            coffee.setType(coffeeType);
            return coffeeRepo.save(coffee);
        }

        return null;
    }

    @Override
    public void delete(Integer id) {
        coffeeRepo.deleteById(id);
    }

}
