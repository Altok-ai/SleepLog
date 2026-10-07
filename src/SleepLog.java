public class SleepLog {
    private String date;
    private String dayType;
    private int sleepMinutes;
    private int wakeUps;

    public String getDate() {
        return date;
}

    public void setDayType(String newDayType){
        if (!newDayType.equals("")) {
            dayType = newDayType;
        }
        else{
            System.out.println("Қате: күн түрін дұрыс көрсетіңіз");
        }

    }
}
