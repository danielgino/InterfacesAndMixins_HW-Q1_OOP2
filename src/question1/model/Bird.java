package question1.model;

import interfaces.CanFly;
import interfaces.HasFeathers;
import interfaces.LayEggs;

public abstract class Bird extends Animal implements CanFly, HasFeathers, LayEggs {

    public boolean hasFeathers() {
        return true;
    }

    public boolean laysEggs() {
        return true;
    }

    public boolean canFly() {
        return true;
    }
    @Override
    public String getType() {
        return "Bird";
    }

}
