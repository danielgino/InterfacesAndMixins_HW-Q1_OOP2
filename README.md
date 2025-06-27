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
