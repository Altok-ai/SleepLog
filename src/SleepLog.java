public class SleepLog {
    private String date;
    private String dayType;
    private int sleepMinutes;
    private int wakeUps;

    public String getDate() {
        return date;
    }
    public void setDate(String d) {
        if (d != null && !d.equals("")){
            date = d;
        }
        else {
            System.out.println("Қате болды. Күн бос болмасын");
        }
    }
    public String getDayType() {
        return dayType;
    }

    public void setDayType(String newDayType){
        if (!newDayType.equals("")) {
            dayType = newDayType;
        }
        else{
            System.out.println("Қате: күн түрін дұрыс көрсетіңіз");
        }
    }
    public int getSleepMinutes(){
        return sleepMinutes;
    }
    public void setSleepMinutes(int newSleepMinutes){
        if (newSleepMinutes >= 0 && newSleepMinutes <= 1440){
            sleepMinutes = newSleepMinutes;}
        else {
            System.out.println("Дұрыстаңыз. Ұйықтау минуты -1 ден үлкен 1441 минуттан кіші болуы керек");
        }
    }

    public int getWakeUps() {
        return wakeUps;
    }

    public void setWakeUps(int wu) {
        if (wu >= 0 && wu <= 20){
            wakeUps = wu;
        } else {
            System.out.println("Қате: ояну саны 0 мен 20 арасында болуы керек");
        }
    }
    public boolean isEnough() {
        return sleepMinutes >= 420;
    }
    public void printInfo() {
        System.out.println(date + " | " + dayType + " | " + sleepMinutes + " мин | ояну: " + wakeUps);
    }
0""}

