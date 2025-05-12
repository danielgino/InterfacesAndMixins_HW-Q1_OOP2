package model;

import interfaces.HasLeaves;
import interfaces.HasWood;
import interfaces.IsBig;
import model.Plant;

public abstract class Tree extends Plant implements HasLeaves, HasWood, IsBig {
    public boolean hasLeaves() {
        return true;
    }

    public boolean hasWood() {
        return true;
    }

    public boolean isBig() {
        return true;
    }

    @Override
    public String getType() {
        return "Tree";
    }
}
