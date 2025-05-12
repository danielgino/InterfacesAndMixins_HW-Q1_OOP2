package animals.birds;


import interfaces.HasColor;
import model.Bird;

import static utils.Constants.EUROPEAN_ROBIN_COLOR;

public class EuropeanRobin extends Bird implements HasColor {
    @Override
    public String getColor() {
        return EUROPEAN_ROBIN_COLOR;
    }

    @Override
    public String getType() {
        return "European Robin";
    }
}
