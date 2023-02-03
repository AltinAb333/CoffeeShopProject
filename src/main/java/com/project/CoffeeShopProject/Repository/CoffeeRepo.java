package com.project.CoffeeShopProject.Repository;

import com.project.CoffeeShopProject.Pojo.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepo extends CrudRepository<Coffee, Integer> {
    List<Coffee> findAll();

    Coffee findCoffeeById(Integer id);

}
