package question1.animals.birds;

import interfaces.CanSing;
import interfaces.HasColor;
import question1.model.Bird;

import static question1.utils.Constants.YELLOW;

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


