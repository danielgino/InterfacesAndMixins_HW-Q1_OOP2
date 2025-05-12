package animals.birds;
import interfaces.CanTalk;
import interfaces.HasColor;
import model.Bird;

import static utils.Constants.WHITE;

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
