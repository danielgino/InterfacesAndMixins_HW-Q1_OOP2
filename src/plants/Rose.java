package plants;

import interfaces.HasColor;
import interfaces.IsBeautiful;
import model.Flower;

import static utils.Constants.RED;

public class Rose extends Flower implements HasColor, IsBeautiful {

    @Override
    public String getColor() {
        return RED;
    }
    @Override
    public String getType() {
        return "Rose";
    }
}
