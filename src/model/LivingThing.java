package model;

import interfaces.CanGrow;
import interfaces.CanReproduce;
import interfaces.IsAlive;

public abstract class LivingThing implements IsAlive, CanGrow, CanReproduce {

    public boolean isAlive() {
        return true;
    }

    public boolean canGrow() {
        return true;
    }

    public boolean canReproduce() {
        return true;
    }

    public  String getType(){
        return "Creature";
    };

}
