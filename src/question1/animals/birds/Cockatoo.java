package question1.animals.birds;
import interfaces.CanTalk;
import interfaces.HasColor;
import question1.model.Bird;

import static question1.utils.Constants.WHITE;

public class Cockatoo extends Bird implements HasColor, CanTalk {

    @Override
    public boolean canTalk() {
        return true;
    }

    @Override
    public String getColor() {
        return WHITE;
    }

    @Override
    public String getType() {
        return "Cockatoo";
    }
}
