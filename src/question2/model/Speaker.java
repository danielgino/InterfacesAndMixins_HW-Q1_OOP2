package question2.model;

import question2.abstracts.ElectronicDevice;
import question2.interfaces.AudioControl;
import question2.interfaces.Operate;

public class Speaker extends ElectronicDevice implements Operate,AudioControl {
    @Override
    public void controlVolume() {
        System.out.println("Control Volume ");

    }

    @Override
    public void operate() {
        switchOn();
        controlVolume();
    }
}
