package com.workintech.burgercompany.model;

import com.workintech.burgercompany.enums.BreadRollType;

public class DeluxeBurger extends Hamburger{
    private Drink drink;
    private Chips chips;

    public DeluxeBurger(Drink drink, Chips chips) {
        super("DELUXE BURGER", "DOUBLE",  19.10 , BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.chips = chips;
    }
    public void addAddition(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getType() + "\n");
        builder.append("CIPS: " + chips.getChipsType() + "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }
}
