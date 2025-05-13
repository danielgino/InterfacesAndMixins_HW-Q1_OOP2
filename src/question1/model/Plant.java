package question1.model;

import interfaces.DoesPhotosynthesize;
import interfaces.HasRoots;
import question1.model.LivingThing;

public abstract class Plant extends LivingThing implements DoesPhotosynthesize, HasRoots {
    public boolean doesPhotosynthesize() {
        return true;
    }

    public boolean hasRoots() {
        return true;
    }

    @Override
    public String getType() {
        return "Plant";
    }
}
