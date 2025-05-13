package question2;


import question2.abstracts.ElectronicDevice;
import question2.interfaces.Operate;
import question2.model.*;

import java.util.List;
import java.util.Scanner;

import static question2.HouseLocations.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainQuest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//            Operate[] devices = {
//                    new Television(),
//                    new Speaker(),
//                    new Radio(),
//                    new ElectricMotor(),
//                    new MechanicalMotor(),
//                    new Refrigerator(),
//                    new Oven()
//
//            };

        Television tv = new Television();
        Refrigerator fridge = new Refrigerator();
        Oven oven = new Oven();
        Radio radio = new Radio();
        Speaker speaker = new Speaker();
        ElectricMotor electricMotor = new ElectricMotor();
        MechanicalMotor mechanicalMotor = new MechanicalMotor();
       List <Object> devices=List.of(tv,fridge,oven,radio,speaker,electricMotor,mechanicalMotor);

        RemoteControl remoteControl=new RemoteControl(devices);

        while (true){
            System.out.println("Welcome ! You just entered the 🏠 choose what to switch on💡");
            System.out.println("1.Turn on Kitchen room");
            System.out.println("2.Turn on Living room");
            System.out.println("3.Turn on Bed room");
            System.out.println("4.Turn on Garage");
            System.out.println("5.Leave 🏠");
            System.out.print(">>> ");
            String input = scanner.nextLine().trim();

           switch (input) {
               case "1":
                   remoteControl.operateByLocation(KITCHEN);
                    break;
               case "2":
                   remoteControl.operateByLocation(LIVING_ROOM);
                   break;
               case "3":
                   remoteControl.operateByLocation(BED_ROOM);
                   break;
               case "4" :
                   remoteControl.operateByLocation(GARAGE);
                   break;
               case "5":
                   System.out.println("Exiting👋 ...");
                   return;
               default:
                   System.out.println("Invalid choice. Please enter a number between 1-5.");
                   return;
           }
        }

//            for (Operate device : devices) {
//                System.out.println("\n🟢 Operating device:");
//                device.operate();
//            }
        }

    }
