package plants;

import interfaces.HasColor;
import model.Tree;

import static utils.Constants.GREEN;

public class Oak extends Tree implements HasColor {


    @Override
    public String getColor() {
        return GREEN;
    }
    @Override
    public String getType() {
        return "Oak tree";
    }
}
