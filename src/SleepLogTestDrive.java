public class SleepLogTestDrive {
    public static void main(String[] args) {
        SleepLog item = new SleepLog();
        item.setSleepMinutes(480);

        item.setSleepMinutes(1441);
        if (item.getSleepMinutes() == 480) {
            System.out.println("ТЕСТ 1 (жоғарғы шектен асқан мән қабылданбайды): OK");
        } else {
            System.out.println("ТЕСТ 1: ҚАТЕ");
        }

        item.setSleepMinutes(-1);
        if (item.getSleepMinutes() == 480) {
            System.out.println("ТЕСТ 2 (төменгі шектен кем мән қабылданбайды): OK");
        } else {
            System.out.println("ТЕСТ 2: ҚАТЕ");
        }
    }
}