package com.undina.projectrest.model;

import java.time.LocalDate;

public class Vote extends AbstractBaseEntity{
    private User user;
    private Restaurant restaurant;
    private LocalDate date;

    public Vote(Integer id, User user, Restaurant restaurant, LocalDate date) {
        super(id);
        this.user = user;
        this.restaurant = restaurant;
        this.date = date;
    }
}
