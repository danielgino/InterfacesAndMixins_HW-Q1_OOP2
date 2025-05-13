package question1.animals.birds;


import interfaces.HasColor;
import question1.model.Bird;

import static question1.utils.Constants.EUROPEAN_ROBIN_COLOR;

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
