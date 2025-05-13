package question1.model;

import interfaces.CanSwim;
import interfaces.HasGills;
import interfaces.HasScales;
import interfaces.LayEggs;

public abstract class Fish extends Animal implements HasScales, CanSwim, HasGills, LayEggs {


    public boolean hasScales() {
        return true;
    }
    public boolean canSwim() {
        return true;
    }
    public boolean hasGills() {
        return true;
    }

    public boolean laysEggs() {
        return true;
    }


    @Override
    public String getType() {
        return "Fish";
    }
}