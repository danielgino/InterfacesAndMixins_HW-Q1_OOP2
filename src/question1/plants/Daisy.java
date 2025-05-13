package question1.plants;

import interfaces.HasColor;
import interfaces.IsBeautiful;
import question1.model.Flower;

import static question1.utils.Constants.WHITE;

public class Daisy extends Flower implements HasColor, IsBeautiful {
    @Override
    public String getColor() {
        return WHITE;
    }
    @Override
    public String getType() {
        return "Daisy";
    }
}
