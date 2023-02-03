package com.project.CoffeeShopProject.Pojo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "coffee_id")
    private Coffee coffee;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private CoffeeType type;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "date")
    private Date date;

    public Orders(Integer id, Coffee coffee, String name, CoffeeType type, Double totalPrice, Date date) {
        this.id = id;
        this.coffee = coffee;
        this.name = name;
        this.type = type;
        this.totalPrice = totalPrice;
        this.date = date;
    }

    public Orders() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
