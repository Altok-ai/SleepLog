import java.util.Scanner;

public class SleepLogApp {
    public static void main(String[] args) {
        SleepLogLog log = new SleepLogLog();

        // Өз деректеріңіз (кемінде 10 жазба)
        log.addRecord("04.10", "демалыс", 498, 2);
        log.addRecord("05.10", "оқу күні", 402, 1);
        log.addRecord("06.10", "оқу күні", 483, 0);
        log.addRecord("07.10", "демалыс", 492, 0);
        log.addRecord("08.10", "оқу күні", 436, 0);
        log.addRecord("13.10", "оқу күні", 328, 0);
        log.addRecord("14.10", "демалыс", 510, 0);
        log.addRecord("15.10", "оқу күні", 264, 0);
        log.addRecord("16.10", "демалыс", 510, 0);
        log.addRecord("17.10", "оқу күні", 452, 0);
        log.addRecord("18.10", "демалыс", 497, 0);

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("=== Ұйқы режимі (SleepLog) ===");
            System.out.println("1 - Барлық жазбалар");
            System.out.println("2 - Жазбалар саны, қосынды, орташа мән");
            System.out.println("3 - Ең үлкен мәні бар жазба");
            System.out.println("4 - Ереже: ұйқы 420 минуттан (7 сағаттан) кем емес");
            System.out.println("5 - Сүзу: күн түрі бойынша");
            System.out.println("0 - Шығу");
            System.out.print("Таңдауыңыз: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Enter пернесін тазалау

            if (choice == 1) {
                log.printAll();
            } else if (choice == 2) {
                System.out.println("Жазбалар саны: " + log.getCount());
                System.out.println("Қосынды: " + log.getTotal() + " мин");
                System.out.println("Орташа мән: " + log.getAverage() + " мин");
            } else if (choice == 3) {
                SleepLog max = log.findMax();
                if (max != null) {
                    max.printInfo();
                }
            } else if (choice == 4) {
                System.out.println("Ережеге сай жазбалар саны: " + log.countMatches());
            } else if (choice == 5) {
                System.out.print("Күн түрін енгізіңіз (оқу күні / демалыс): ");
                String text = scanner.nextLine();
                log.printByCategory(text);
            } else if (choice != 0) {
                System.out.println("Мұндай пункт жоқ");
            }
        }

        System.out.println("Сау болыңыз!");
        scanner.close();
    }
}