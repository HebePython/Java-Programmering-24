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
    public Time(int h, int m, int s) { //constructor for 3 variables, calls setter.
        setTime(h, m, s);
    }
    public int getHours() { //getter for hours
        return hours;
    }
    public int getMinutes() { //getter for min
        return minutes;
    }
    public int getSeconds() { //getter for sec
        return seconds;
    }
    public void setTime(int hours, int minutes, int seconds) { //setter for time. calls validate time.
        validateTime(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    private void validateTime(int h, int m, int s){ //Validates time and throws error.
        try {                                       // Could add a system.exit() on error?
            if (m < 0 || m > 59) {                  // Could add scanner & while loop to keep asking for a legal time
                throw new IllegalArgumentException("Time: bad minutes value: " + h + "." + m);        
            }
            if (s < 0 || s > 59) {
                throw new IllegalArgumentException("Time: bad seconds value: " + h + "." + m + "." + s);
            }
            if (h < 0 || h > 23) {
                throw new IllegalArgumentException("Time: bad hour value: " + h + "." + m);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught in constructor: " + e.getMessage());
        } 
    }

    public boolean isAm(int value) { //checks for AM PM method
        if (value < 12) {
            return true;
        } else {
            return false;
        }
    }

    public void toString(int hours, int minutes, int seconds) { //prints in 24 hour format
        System.out.printf("%02d:%02d:%02d\n", 
        hours, minutes, seconds);
    }
    public void toString12(int hours, int minutes, int seconds) { //prints in 12 hour format.

        String amPm = "PM";
        
        if (isAm(hours) == true) { //calls isAM metho to check AM/PM
            amPm = "AM";
        }
        if (hours > 12) { // turns 24 format -> 12 hr format.
            hours -= 12;
        }
        System.out.printf("%d:%02d:%02d %s\n", hours, minutes, seconds, amPm);
    }

    public void incrSecond() { //increases seconds and calls min if seconds are at 59

        if (this.seconds == 59) {
            incrMin();
            this.seconds = 0;
        } else {
            this.seconds++;
        }
        
        
    }
    public void incrMin() { //increases min and calls incrhours if minutes are at 59 and reset to 0

        if (this.minutes != 59 && this.seconds == 59) {
            this.minutes++;
        } else if (this.minutes == 59) {
            incrHour();
            this.minutes = 0;
        }
    }
    public void incrHour() { //increases hours and resets if hrs at 23. 
        
        if (this.hours != 23 && this.minutes == 59) {
            this.hours++;
        } else if (this.hours == 23){
            this.hours = 0;
        }
    }
    public void increaseTime(int incrAmount) { //increase time methos with loop, calls incrsec
    for (int i = 0; i < incrAmount; i++) {      
        incrSecond();
        }
        validateTime(this.hours, this.minutes, this.seconds);
    }

    public int compareTo(int otherhour, int othermin, int othersec) { //compares hrs, mins, secs
        if (this.hours - otherhour != 0 ) {                           
           return this.hours - otherhour;
        } else if (this.minutes - othermin != 0) {
            return this.minutes - othermin; 
        } else if (this.seconds - othersec != 0) {
            return this.seconds - othersec;
        } else {
            return 0;
        }
    
        
    }
}


class Main {

    public static void main(String[] args) {

        Time time1 = new Time(14, 0, 0);
        time1.toString(time1.hours, time1.minutes, time1.seconds);
        
        time1.increaseTime(3600); //increases time by seconds

        time1.toString(time1.hours, time1.minutes, time1.seconds);
        time1.toString12(time1.hours, time1.minutes, time1.seconds);

        System.out.println(time1.compareTo(6, 0, 0)); //compares times, and prints a number.
    }                                                                             
}