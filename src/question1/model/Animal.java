package question1.model;
import interfaces.CanMove;
import interfaces.HasNervousSystem;
import interfaces.HasSkin;
import question1.model.LivingThing;

public abstract class Animal extends LivingThing implements CanMove, HasSkin, HasNervousSystem {
    public boolean canMove() {
        return true;
    }

    public boolean hasSkin() {
        return true;
    }
    public boolean hasNervousSystem() {
        return true;
    }

    @Override
    public String getType() {
        return "Animal";
    }
}
