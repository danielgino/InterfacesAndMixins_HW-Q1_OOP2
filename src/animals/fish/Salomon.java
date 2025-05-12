package animals.fish;
import interfaces.HasColor;
import model.Fish;

import static utils.Constants.SALOMON_COLOR;

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
