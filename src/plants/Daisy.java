package plants;

import interfaces.HasColor;
import interfaces.IsBeautiful;
import model.Flower;

import static utils.Constants.WHITE;

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
