package task24;

public class Time{
    private int hour;
    private int min;

    public Time(int hour, int min) {
        if(this.hour < 24 && this.min < 60){
            this.hour = hour;
            this.min = min;
        } else {
            System.out.println("Not correct time");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    @Override
    public String toString() {
        return hour + ":" + min;
    }
}