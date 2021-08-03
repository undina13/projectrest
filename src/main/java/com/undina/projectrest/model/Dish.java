package com.undina.projectrest.model;



public class Dish extends AbstractNamedEntity{
    private Double price;

    public Dish(Integer id, String name, Double price) {
        super(id, name);
        this.price = price;
    }
}
