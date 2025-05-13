package question2.abstracts;

import question2.interfaces.SwitchOn;

public abstract class ElectronicDevice implements SwitchOn {

    public void switchOn(){
        System.out.println("Switch On");
    }
}
