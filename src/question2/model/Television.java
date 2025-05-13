package question2.model;

import question2.abstracts.FrequencyDevice;
import question2.interfaces.AudioControl;
import question2.interfaces.ChangeResolution;
import question2.interfaces.Operate;

public class Television extends FrequencyDevice implements Operate,AudioControl, ChangeResolution {


    public void controlVolume(){
        System.out.println("Control Volume");
    }
    public void changeResolution(){
        System.out.println("Change Resolution");
    }


    @Override
    public void operate() {
        switchOn();
        changeResolution();
        channelTuning();
        controlVolume();
    }
}
