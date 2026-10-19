public class SleepLogLog {
    private SleepLog[] items = new SleepLog[30];
    private int count = 0;

    public boolean addRecord(String recordDate, String recordDayType, int recordSleepMinutes, int recordWakeUps){
        if (count >= items.length){
            return false;
        }
        SleepLog entry = new SleepLog();
        entry.setDate(recordDate);
        entry.setDayType(recordDayType);
        entry.setSleepMinutes(recordSleepMinutes);
        entry.setWakeUps(recordWakeUps);

        items[count] = entry;
        count = count + 1;
        return true;
    }
    public int getCount() {
        return count;
    }
    public int getTotal(){
        int total = 0;
        int i = 0;
        while (i < count) {
            total = total + items[i].getSleepMinutes();
            i = i + 1;
        }
        return total;
    }
    public int getAverage(){
        if (count == 0){
            return 0;
        }
        return getTotal() / count;
    }
    public SleepLog findMax(){
        if (count == 0){
            return null;
        }
        SleepLog max = items[0];
        int i = 1;
        while (i < count) {
            if (items[i].getSleepMinutes() > max.getSleepMinutes()){
                max = items[i];
            }
            i = i + 1;
        }
        return max;
    }
    public int countMatches(){
        int matches = 0;
        int i = 0;

        while (i < count) {
            if (items[i].isEnough()){
                matches = matches + 1;
            }
            i = i +1;
        }
        return matches;
    }
    public void printAll() {
        int i = 0;
        while (i<count) {
            System.out.print((i + 1) + ". ");
            items[i].printInfo();
            i = i + 1;
        }
    }
    public void printByCategory(String value){
        int found = 0;
        int i = 0;

        while (i<count){
            if (items[i].getDayType().equals(value)){
                items[i].printInfo();
                found = found + 1;
            }
            i = i +1;
        }
        if (found == 0){
            System.out.println("Мұндай жазба табылмады");
        }
    }
    public void printAboveAverage() {
        int avg = getAverage();
        System.out.println("Орташа ұйқы ұзақтығы: " + avg + " мин.");
        System.out.println("Орташадан ұзақ ұйықтаған күндер тізімі:");
        int found = 0;
        int i = 0;
        while (i < count) {
            if (items[i].getSleepMinutes() > avg) {
                items[i].printInfo();
                found = found + 1;
            }
            i = i + 1;
        }
        if (found == 0) {
            System.out.println("Орташадан ұзақ ұйықтаған күндер жоқ.");
        }
    }
}
