package model;

import interfaces.HasPetals;
import interfaces.IsBeautiful;

public abstract class Flower extends Plant implements HasPetals, IsBeautiful {

    public boolean hasPetals() {
        return true;
    }

    public boolean isBeautiful() {
        return true;
    }


    public abstract String getColor();

    @Override
    public String getType() {
        return "Flower";
    }
}
