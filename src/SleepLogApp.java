public class SleepLogApp {
    public static void main(String[] args) {
        SleepLogLog log = new SleepLogLog();

        log.addRecord("04.10", "демалыс", 498, 2);
        log.addRecord("05.10", "оқу күні", 402, 1);
        log.addRecord("06.10", "оқу күні", 483, 0);
        log.addRecord("07.10", "демалыс", 492, 0);
        log.addRecord("08.10", "оқу күні", 436, 0);
        log.addRecord("13.10", "оқу күні", 328, 0);
        log.addRecord("14.10", "демалыс", 510, 0);
        log.addRecord("15.10", "оқу күні", 264, 0);

        System.out.println("Ұйқы режимі: алғашқы деректер");
        log.printAll();
    }
}