package question1.animals.fish;
import interfaces.HasColor;
import question1.model.Fish;

import static question1.utils.Constants.SALOMON_COLOR;

public class Salomon extends Fish implements HasColor {
    @Override
    public String getColor() {
        return SALOMON_COLOR;
    }

    @Override
    public String getType() {
        return "Salomon";
    }
}
