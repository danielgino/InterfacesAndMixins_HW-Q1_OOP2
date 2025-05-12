package animals.birds;

import interfaces.CanSing;
import interfaces.HasColor;
import model.Bird;

import static utils.Constants.YELLOW;

    public class Canary extends Bird implements CanSing, HasColor {

        @Override
        public boolean canSing() {
            return true;
        }

        @Override
        public String getColor() {
            return YELLOW;
        }
    }


