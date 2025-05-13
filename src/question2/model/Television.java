package question2.model;

import question2.HouseLocations;
import question2.abstracts.FrequencyDevice;
import question2.interfaces.AudioControl;
import question2.interfaces.ChangeResolution;
import question2.interfaces.Located;
import question2.interfaces.Operate;

import java.util.List;

import static question2.HouseLocations.*;

public class Television extends FrequencyDevice implements Located,Operate,AudioControl, ChangeResolution {

    @Override
    public void controlVolume(){
        System.out.println("TV Control Volume📢");
    }
    @Override
    public void changeResolution(){
        System.out.println("Change TV Resolution📺");
    }


    @Override
    public void operate() {
        switchOn();
        changeResolution();
        channelTuning();
        controlVolume();
    }
    @Override
    public List<HouseLocations> getLocations() {
        return List.of(BED_ROOM,LIVING_ROOM);
    }
}
