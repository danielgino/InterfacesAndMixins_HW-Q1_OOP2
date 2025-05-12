import animals.birds.*;
import animals.fish.*;
import plants.*;

import java.util.*;

public class MainQuest1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = List.of(
                "קנרית",
                "קקדו",
                "אדום החזה",
                "סלמון",
                " דג שמש",
                "עץ אורן",
                "עץ אלון",
                "ורד"
        );

        Map<String, Object> animalsWiki = Map.of(
                "קנרית", new Canary(),
                "קקדו", new Cockatoo(),
                "אדום החזה", new EuropeanRobin(),
                "סלמון", new Salomon(),
                "דג שמש", new Sunfish(),
                "עץ אורן", new Oak(),
                "עץ אלון", new Pine(),
                "ורד", new Rose(),
                "מרגנית", new Daisy()
        );

        while (true) {
            System.out.println("\n===== תפריט ראשי =====");
            System.out.println("1. בחר יצור לשאול עליו");
            System.out.println("2. דוגמאות לשאלות תקינות");
            System.out.println("3. יציאה מהתוכנית");
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equals("1")) {
                System.out.println("\nבחר יצור:");
                for (int i = 0; i < names.size(); i++) {
                    System.out.println((i + 1) + ". " + names.get(i));
                }
                System.out.println("אנא הקלד מספר בלבד:");
                System.out.print("> ");
                String choiceStr = scanner.nextLine().trim();

                int choice;
                try {
                    choice = Integer.parseInt(choiceStr);
                } catch (NumberFormatException e) {
                    System.out.println("נא לבחור יצור מהרשימה.");
                    continue;
                }

                if (choice < 1 || choice > names.size()) {
                    System.out.println("אין יצור במספר הזה.");
                    continue;
                }

                String selectedName = names.get(choice - 1);
                Object selected = animalsWiki.get(selectedName);

                System.out.println("\nשאל שאלות על \"" + selectedName + "\"");
                System.out.println("(כתוב 'תפריט' לחזרה לתפריט או 'יציאה' כדי לסיים)\n");

                while (true) {
                    System.out.print(">>>>> ");
                    String question = scanner.nextLine().trim();

                    if (question.equalsIgnoreCase("יציאה")) {
                        System.out.println("להתראות!");
                        return;
                    }

                    if (question.equalsIgnoreCase("תפריט")) {
                        break;
                    }

                    QuestionHandler.answer(selected, question);
                }

            } else if (input.equals("2")) {
                System.out.println("\n===== דוגמאות לשאלות תקינות =====");
                System.out.println("- האם הקנרית יכולה לעוף?");
                System.out.println("- מה הצבע של הורד?");
                System.out.println("- האם הסלמון שוחה?");
                System.out.println("- זה דבר חי?");
                System.out.println("- האם לעץ יש גזע?");
                System.out.println("- האם הוורד מפיץ ריח?");
                System.out.println("- האם העץ עושה פוטוסינתזה?");
                System.out.println("- האם הדג נושם?");
                System.out.println("- האם הקקדו יכול לדבר?");
                System.out.println("- האם זה דבר חי?");
                System.out.println("- האם יש לו מערכת עצבים?");
                System.out.println("- האם יש לו קשקשים?");
                System.out.println("- האם הוא מרגיש כאב?");
                System.out.println();
            } else if (input.equals("3") || input.equals("יציאה")) {
                System.out.println("להתראות!");
                break;
            } else {
                System.out.println("אפשרויות תקינות: 1 / 2 / 3 או 'יציאה'");
            }
        }
    }
}
