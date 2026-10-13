public class SleepLogTestDrive {
    public static void main(String[] args) {
        // 1 және 2-тест: Сеттерді тексеру
        SleepLog item = new SleepLog();

        item.setSleepMinutes(1500);
        if (item.getSleepMinutes() == 0) {
            System.out.println("ТЕСТ 1 (жоғарғы шектен асқан мән қабылданбайды): OK");
        } else {
            System.out.println("ТЕСТ 1: ҚАТЕ");
        }

        item.setSleepMinutes(-10);
        if (item.getSleepMinutes() == 0) {
            System.out.println("ТЕСТ 2 (төменгі шектен кем мән қабылданбайды): OK");
        } else {
            System.out.println("ТЕСТ 2: ҚАТЕ");
        }

        // 3, 4, 5-тест: Журналды тексеру
        SleepLogLog log = new SleepLogLog();
        log.addRecord("10.10", "оқу күні", 360, 2);
        log.addRecord("11.10", "демалыс", 480, 0);
        log.addRecord("12.10", "оқу күні", 420, 1);

        // ТЕСТ 3: Қосынды (360 + 480 + 420 = 1260)
        if (log.getTotal() == 1260) {
            System.out.println("ТЕСТ 3 (қосынды): OK");
        } else {
            System.out.println("ТЕСТ 3: ҚАТЕ");
        }

        // ТЕСТ 4: Ең үлкен мән (480)
        SleepLog max = log.findMax();
        if (max != null && max.getSleepMinutes() == 480) {
            System.out.println("ТЕСТ 4 (ең үлкен мән): OK");
        } else {
            System.out.println("ТЕСТ 4: ҚАТЕ");
        }

        // ТЕСТ 5: Ережеге сай саны (480 және 420 >= 420, яғни 2 жазба)
        if (log.countMatches() == 2) {
            System.out.println("ТЕСТ 5 (ереже бойынша санау): OK");
        } else {
            System.out.println("ТЕСТ 5: ҚАТЕ");
        }
    }
}