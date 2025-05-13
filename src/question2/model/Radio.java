package question2.model;

import question2.HouseLocations;
import question2.abstracts.FrequencyDevice;
import question2.interfaces.AudioControl;
import question2.interfaces.Located;
import question2.interfaces.Operate;

import java.util.List;

import static question2.HouseLocations.*;

public class Radio extends FrequencyDevice implements Located,Operate, AudioControl {
    @Override
    public void controlVolume() {
        System.out.println("Control Radio Volume📢");
    }

    @Override
    public void operate() {
        switchOn();
        channelTuning();
        controlVolume();
    }
    @Override
    public List<HouseLocations> getLocations() {
        return List.of(LIVING_ROOM,BED_ROOM);
    }
}
