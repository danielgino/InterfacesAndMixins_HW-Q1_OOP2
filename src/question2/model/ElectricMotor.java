package question2.model;

import question2.abstracts.ElectronicDevice;
import question2.interfaces.Operate;
import question2.interfaces.SpeedControl;

public class ElectricMotor  extends ElectronicDevice implements Operate,SpeedControl {
    @Override
    public void controlSpeed() {
        System.out.println("Control Speed");
    }

    @Override
    public void operate() {
        switchOn();
        controlSpeed();
    }
}
