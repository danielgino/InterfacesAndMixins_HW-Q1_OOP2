package question2.model;

import question2.HouseLocations;
import question2.abstracts.ElectronicDevice;
import question2.interfaces.ChangeTemperature;
import question2.interfaces.Located;
import question2.interfaces.Operate;
import question2.interfaces.SpeedControl;

import java.util.List;

import static question2.HouseLocations.KITCHEN;

public class Refrigerator extends ElectronicDevice implements Located,Operate, ChangeTemperature, SpeedControl {


    @Override
    public void controlSpeed() {
        System.out.println("Refrigerator C️ontrol Speed 🏎️");
    }
    @Override
    public void changeTemperature() {
        System.out.println("Changing Refrigerator Temperature");
    }
    @Override
    public void operate() {
    switchOn();
    controlSpeed();
    changeTemperature();
    }
    @Override
    public List<HouseLocations> getLocations() {
        return List.of(KITCHEN);
    }


}
