package animals.fish;

import interfaces.HasColor;
import model.Fish;

import static utils.Constants.*;

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
