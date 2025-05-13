package question2;


import question2.interfaces.Operate;
import question2.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainQuest2 {
    public static void main(String[] args) {

            Operate[] devices = {
                    new Television(),
                    new Speaker(),
                    new Radio(),
                    new ElectricMotor(),
                    new MechanicalMotor()
            };

            for (Operate device : devices) {
                System.out.println("\n🟢 Operating device:");
                device.operate();
            }
        }

    }
