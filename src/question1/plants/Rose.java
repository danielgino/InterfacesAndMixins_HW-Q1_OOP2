package question1.plants;

import interfaces.HasColor;
import interfaces.IsBeautiful;
import question1.model.Flower;

import static question1.utils.Constants.RED;

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
