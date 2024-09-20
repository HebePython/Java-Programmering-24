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

    public boolean isAm(int value) {
        if (value < 12) {
            return true;
        } else {
            return false;
        }
    }

    public void toString(int hours, int minutes, int seconds) {
        System.out.printf("%02d:%02d:%02d\n", 
        this.hours, this.minutes, this.seconds);
    }
    public void toString12(int hours, int minutes, int seconds) {

        String amPm = "PM";
        
        if (isAm(this.hours) == true) {
            amPm = "AM";
        }
        if (this.hours > 12) {
            this.hours -= 12;
        }
        System.out.printf("%d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, amPm);
    }

    public void incrSecond() {

        if (this.seconds >= 59) {
            this.seconds = 0;
            this.minutes++;
        } else {
            this.seconds++;
        }
        
        
    }
    public void incrMin() { // fix so minute cant be 60
        
        if (this.minutes == 59) {
            this.minutes = 0;
            this.hours++;
        } else {
            this.minutes++;
        }
    }
    public void incrHour() {
        
        if (this.hours == 23) {
            this.hours = 0;
        } else {
            this.hours++;
        }
    }
    public void increaseTime(int incrAmount) {
    for (int i = 0; i < incrAmount; i++) {
  //      System.out.println(this.seconds);
        incrSecond();

        }
    }
}


class Main {

    public static void main(String[] args) {

        Time time1 = new Time(5, 0, 0);
        time1.toString(time1.hours, time1.minutes, time1.seconds);
        
        time1.increaseTime(3600);

        time1.toString(time1.hours, time1.minutes, time1.seconds);
    }
}