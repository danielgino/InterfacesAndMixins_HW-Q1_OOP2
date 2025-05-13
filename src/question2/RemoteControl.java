package question2;

import question2.HouseLocations;
import question2.interfaces.Located;
import question2.interfaces.Operate;

import java.util.List;

public class RemoteControl {

    private final List<Object> devices;

    public RemoteControl(List<Object> devices) {
        this.devices = devices;
    }

    public void operateByLocation(HouseLocations location) {
        System.out.println("Operating devices in: " + location);

        for (Object device : devices) {
            if (device instanceof Located located && device instanceof Operate operable) {
                if (located.getLocations().contains(location)) {
                    System.out.println("-----");
                    operable.operate();
                }
            }
        }
    }

    public void operateAll() {
        System.out.println("Operating all devices:");
        for (Object device : devices) {
            if (device instanceof Operate operable) {
                operable.operate();
            }
        }
    }
}
