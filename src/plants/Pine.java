package plants;

import interfaces.HasColor;
import model.Tree;

import static utils.Constants.GREEN;

public class Pine extends Tree implements HasColor {

    @Override
    public String getColor() {
        return GREEN;
    }

    @Override
    public String getType() {
        return "Pine Tree";
    }
}
