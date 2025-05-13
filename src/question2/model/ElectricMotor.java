package question2.model;

import question2.HouseLocations;
import question2.abstracts.ElectronicDevice;
import question2.interfaces.Located;
import question2.interfaces.Operate;
import question2.interfaces.SpeedControl;

import java.util.List;

import static question2.HouseLocations.GARAGE;

public class ElectricMotor  extends ElectronicDevice implements Located,Operate,SpeedControl {
    @Override
    public void controlSpeed() {
        System.out.println("ElectricMotor Control Speed🏎️");
    }

    @Override
    public void operate() {
        switchOn();
        controlSpeed();
    }

    @Override
    public List<HouseLocations> getLocations() {
        return List.of(GARAGE);
    }
}
