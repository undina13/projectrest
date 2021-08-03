package com.undina.projectrest.model;

import java.time.LocalDate;
import java.util.List;

public class Menu extends AbstractBaseEntity{
    private LocalDate dateTime;
    private List<Dish> dishes ;
    private Restaurant restaurant;

    public Menu(Integer id, LocalDate dateTime, List<Dish> dishes, Restaurant restaurant) {
        super(id);
        this.dateTime = dateTime;
        this.dishes = dishes;
        this.restaurant = restaurant;
    }
}
