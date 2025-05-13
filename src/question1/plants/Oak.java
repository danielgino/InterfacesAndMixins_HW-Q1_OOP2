package question1.plants;

import interfaces.HasColor;
import question1.model.Tree;

import static question1.utils.Constants.GREEN;

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
