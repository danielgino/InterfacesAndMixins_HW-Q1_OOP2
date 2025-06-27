# Object-Oriented Programming Assignment – Question 1

##  Topic: Class Hierarchy & Object Identification

This program demonstrates an object recognition model based on **inheritance**, **abstract classes**, and **Mixins**, simulating how humans classify entities by properties within a class hierarchy.

---

##  Problem Statement

We were asked to model real-world object recognition using a class hierarchy (tree of inheritance), and allow users to ask **natural-language questions** about entities.

For example:
- "Is a canary an animal?"
- "Can the cockatoo talk?"
- "Does a rose smell?"
- "Does the pine perform photosynthesis?"

The tree includes:
- **Animals** (Birds, Fish, etc.)
- **Plants** (Trees, Flowers, etc.)

---

##  Design Overview

###  Inheritance Hierarchy
- `abstract class LivingThing`
  - `abstract class Animal extends LivingThing`
    - `abstract class Bird extends Animal`
      - `Canary`, `Cockatoo`, `EuropeanRobin`
    - `abstract class Fish extends Animal`
      - `Salmon`, `Sunfish`
  - `abstract class Plant extends LivingThing`
    - `abstract class Tree extends Plant`
      - `Oak`, `Pine`
    - `abstract class Flower extends Plant`
      - `Rose`, `Daisy`

###  Mixins (Interfaces)
Implemented interfaces to represent optional behaviors:
- `CanFly`
- `CanSwim`
- `CanTalk`
- `HasNervousSystem`
- `HasScales`

## Output Example: 
```


===== תפריט ראשי =====
1. בחר יצור לשאול עליו
2. דוגמאות לשאלות תקינות
3. יציאה מהתוכנית
> 1

בחר יצור:
1. קנרית
2. קקדו
3. אדום החזה
4. סלמון
5. דג שמש
6. עץ אורן
7. עץ אלון
8. ורד
אנא הקלד מספר בלבד:
> 1

היררכיית מחלקות:
LivingThing -> Animal -> Bird -> Canary

שאל שאלות על "קנרית"
(כתוב 'תפריט' לחזרה לתפריט או 'יציאה' כדי לסיים)

>>>>> האם קנרית יכולה לעוף?
כן.
>>>>> האם קנרית זה ציפור?
כן, זו ציפור.
>>>>> 
```




# Question 2 -  Smart Home Simulation – OOP & Mixins

## Project Overview

This project simulates a **smart home** system where various devices (TVs, radios, speakers, motors, fridge, oven, etc.) can be controlled using a central **Remote Control**.

The system is fully implemented using **Object-Oriented Programming** principles and leverages **Mixins** to define optional device behaviors.

---

## Technologies & Concepts

- ✅ Java (Object-Oriented Design)
- ✅ Abstract classes for base device types
- ✅ Interfaces (Mixins) for specific capabilities
- ✅ Enum for house locations
- ✅ Modular, scalable design

---


###  Class Hierarchy

```
├── ElectronicDevice
│ ├── FrequencyDevice (adds channelTuning)
│ │ ├── Television (display, audio, resolution)
│ │ └── Radio (audio)
│ ├── Refrigerator (located, operable)
│ └── Oven (temp control)
├── MechanicalDevice
│ └── MechanicalMotor (speed control)
```



---

### 🧬 Mixins (Interfaces)

The following interfaces are used as **Mixins** – they define optional behaviors and allow composition across unrelated class hierarchies:

| Interface         | Responsibility             |
|-------------------|----------------------------|
| `Operate`         | Makes a device controllable |
| `Located`         | Ties device to rooms        |
| `AudioControl`    | Supports volume control     |
| `SpeedControl`    | Allows motor speed change   |
| `ChangeResolution`| For changing screen quality |
| `Temp Control`    | Oven-specific Temp         |

---

##  Main Features

- 🔘 **RemoteControl** class:
  - `operateByLocation(HouseLocations location)`
  - `operateAll()`

-  **HouseLocations** enum:
  - `KITCHEN`, `LIVING_ROOM`, `BED_ROOM`, `GARAGE`

-  **Dynamic device operation**:
  - All devices implement only the interfaces they need
  - Remote uses `instanceof` to operate valid devices

---

## 📺 Example Run
```
Welcome ! You just entered the 🏠 choose what to switch on💡
1.Turn on Kitchen room
2.Turn on Living room
3.Turn on Bed room
4.Turn on Garage
5.Turn on All House
6.Leave 🏠
>>> 1
Operating devices in: KITCHEN
-----
Switch On
Refrigerator C️ontrol Speed 🏎️
Changing Refrigerator Temperature
-----
Switch On
Oven C️ontrol Speed 🏎️
Changing Oven Temperature
Welcome ! You just entered the 🏠 choose what to switch on💡
1.Turn on Kitchen room
2.Turn on Living room
3.Turn on Bed room
4.Turn on Garage
5.Turn on All House
6.Leave 🏠
>>> 3
Operating devices in: BED_ROOM
-----
Switch On
Change TV Resolution📺
Channel Tuning
TV Control Volume📢
-----
Switch On
Channel Tuning
Control Radio Volume📢
-----
Switch On
Speaker Control Volume 📢 
Welcome ! You just entered the 🏠 choose what to switch on💡
1.Turn on Kitchen room
2.Turn on Living room
3.Turn on Bed room
4.Turn on Garage
5.Turn on All House
6.Leave 🏠
>>> 

```

