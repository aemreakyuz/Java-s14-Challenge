package com.workintech.burgercompany.model;

import com.workintech.burgercompany.enums.DrinkType;

public class Drink {
    private DrinkType type;

    public Drink(DrinkType type) {
        this.type = type;
    }

    public DrinkType getType() {
        return type;
    }
}
