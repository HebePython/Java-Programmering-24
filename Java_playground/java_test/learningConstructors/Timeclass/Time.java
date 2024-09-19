package Java_playground.java_test.learningConstructors.Timeclass;

public class Time {
    int hours;
    int minutes;
    int seconds;
    
    public Time(int h) {
        this.hours = h;
    }
    public Time(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }
    public Time(int h, int m, int s) {
        validateTime(h, m, s);
        setTime(h, m, s);
    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setTime(int hours, int minutes, int seconds) {
        validateTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    private void validateTime(int h, int m, int s){
        try {
            if (m < 0 || m > 59) {
                throw new IllegalArgumentException("Time: bad value: " + h + "." + m);        
            }
            if (s < 0 || s > 59) {
                throw new IllegalArgumentException("Time: bad value: " + h + "." + m + "." + s);
            }
            if (h < 0 || h > 23) {
                throw new IllegalArgumentException("Time: bad value: " + h + "." + m);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught in constructor: " + e.getMessage());
        } 
    }

    public void toString(int hours, int minutes, int seconds) {
        System.out.printf("%d:%02d:%02d", 
        this.hours, this.minutes, this.seconds);
    }
    public void toString12(int hours, int minutes, int seconds) {

    }
}


class Main {

    public static void main(String[] args) {
        Time time1 = new Time(14, 2, 51);
        time1.toString(time1.hours, time1.minutes, time1.seconds);
    }
}