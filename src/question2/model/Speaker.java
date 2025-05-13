package question2.model;

import question2.HouseLocations;
import question2.abstracts.ElectronicDevice;
import question2.interfaces.AudioControl;
import question2.interfaces.Located;
import question2.interfaces.Operate;

import java.util.List;

import static question2.HouseLocations.*;

public class Speaker extends ElectronicDevice implements Located,Operate,AudioControl {
    @Override
    public void controlVolume() {
        System.out.println("Speaker Control Volume 📢 ");

    }

    @Override
    public void operate() {
        switchOn();
        controlVolume();
    }
    @Override
    public List<HouseLocations> getLocations() {
        return List.of(BED_ROOM,LIVING_ROOM);
    }
}
