package question1.animals.fish;

import interfaces.HasColor;
import question1.model.Fish;

import static question1.utils.Constants.*;

public class Sunfish extends Fish implements HasColor {
    @Override
    public String getColor() {
        return SILVER;
    }

    @Override
    public String getType() {
        return "Sunfish";
    }
}
