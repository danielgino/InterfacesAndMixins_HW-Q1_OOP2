package question2.abstracts;

import question2.abstracts.ElectronicDevice;
import question2.interfaces.ChannelTuning;

public abstract class FrequencyDevice extends ElectronicDevice implements ChannelTuning {
    public void channelTuning(){
        System.out.println("Channel Tuning");
    }
}
