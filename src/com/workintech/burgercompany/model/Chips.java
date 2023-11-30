package com.workintech.burgercompany.model;

import com.workintech.burgercompany.enums.ChipsType;

public class Chips {
    private ChipsType chipsType;

    public Chips(ChipsType chipsType) {
        this.chipsType = chipsType;
    }

    public ChipsType getChipsType() {
        return chipsType;
    }
}
