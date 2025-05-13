package question2.model;

import question2.abstracts.FrequencyDevice;
import question2.interfaces.AudioControl;
import question2.interfaces.Operate;

public class Radio extends FrequencyDevice implements Operate, AudioControl {
    @Override
    public void controlVolume() {
        System.out.println("Control Volume ");
    }

    @Override
    public void operate() {
        switchOn();
        channelTuning();
        controlVolume();
    }
}
