
import model.*;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;

public class QuestionHandler {

    public static void answer(Object obj, String question) {
        question = question.toLowerCase();
        if (question.contains("ציפור") && obj instanceof Bird) {
            System.out.println("כן, זו ציפור.");
            return;
        }
        if (question.contains("דג") && obj instanceof Fish) {
            System.out.println("כן, זה דג.");
            return;
        }
        if (question.contains("עץ") && obj instanceof Tree) {
            System.out.println("כן, זה עץ.");
            return;
        }
        if (question.contains("פרח") && obj instanceof Flower) {
            System.out.println("כן, זה פרח.");
            return;
        }
        if (question.contains("בעל חיים") && obj instanceof Animal) {
            System.out.println("כן, זהו בעל חיים.");
            return;
        }

        Map<String[], Class<?>> interfaceMap = Map.ofEntries(
                Map.entry(new String[]{"דבר חי","נושם"}, interfaces.IsAlive.class),
                Map.entry(new String[]{"לזוז", "נייד", "נע", "זז"}, interfaces.CanMove.class),
                Map.entry(new String[]{"גדל", "לגדול", "גדילה"}, interfaces.CanGrow.class),
                Map.entry(new String[]{"מתרבה", "רבייה"}, interfaces.CanReproduce.class),
                Map.entry(new String[]{"עור"}, interfaces.HasSkin.class),
                Map.entry(new String[]{"מערכת עצבים", "מרגיש כאב","עצבים", "כאב"}, interfaces.HasNervousSystem.class),
                Map.entry(new String[]{"זימים"}, interfaces.HasGills.class),
                Map.entry(new String[]{"קשקשת","קשקשים"}, interfaces.HasScales.class),
                Map.entry(new String[]{"שוחה","לשחות"}, interfaces.CanSwim.class),
                Map.entry(new String[]{"לעוף", "עף", "מעופף","מעופפת","עפה"}, interfaces.CanFly.class),
                Map.entry(new String[]{"לשיר", "שרה", "מצייצת","שר"}, interfaces.CanSing.class),
                Map.entry(new String[]{"עלה","עלי כותרת"}, interfaces.HasPetals.class),
                Map.entry(new String[]{"עלים"}, interfaces.HasLeaves.class),
                Map.entry(new String[]{"גזע"}, interfaces.HasWood.class),
                Map.entry(new String[]{"שורשים", "שורש"}, interfaces.HasRoots.class),
                Map.entry(new String[]{"פותוסינתזה","פוטוסינתזה"}, interfaces.DoesPhotosynthesize.class),
                Map.entry(new String[]{"מטיל ביצים","ביצים","ביצה"}, interfaces.LayEggs.class),
                Map.entry(new String[]{"מדבר", "לדבר"}, interfaces.CanTalk.class)
        );

        Map<String[], String> methodMap = Map.ofEntries(
                Map.entry(new String[]{"צבע", "גוון"}, "getColor"),
                Map.entry(new String[]{"סוג", "טיפוס"}, "getType")
        );

        for (Entry<String[], Class<?>> entry : interfaceMap.entrySet()) {
            for (String keyword : entry.getKey()) {
                if (question.contains(keyword)) {
                    if (entry.getValue().isInstance(obj)) {
                        System.out.println("כן.");
                    } else {
                        System.out.println("לא.");
                    }
                    return;
                }
            }
        }

        for (Entry<String[], String> entry : methodMap.entrySet()) {
            for (String keyword : entry.getKey()) {
                if (question.contains(keyword)) {
                    try {
                        Method method = obj.getClass().getMethod(entry.getValue());
                        Object result = method.invoke(obj);
                        System.out.println("תשובה: " + result);
                        return;
                    } catch (Exception e) {
                        System.out.println("לא ניתן להחזיר מידע על כך.");
                        return;
                    }
                }
            }
        }

        System.out.println("לא הבנתי את השאלה.");
    }
}
