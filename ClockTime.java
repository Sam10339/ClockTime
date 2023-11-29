/**
* Name: Samuel Sexton (sexton)
* Course: CSCI 241 - Computer Science I
* Section: 002
* Assignment: 9
*
* Project/Class Description:
* This program keeps track of information for a clocks time
*
* Known bugs:
* none
*/
public class ClockTime {
    //Instance variables
    private int hour;
    private int minute;
    private int second;

    // Default Constructor
    public ClockTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Constructor with error checking
    public ClockTime(int hour, int minute, int second) {
        if (second > 59) {
            minute += second / 60;
            second %= 60;
        } else if (second < 0) {
            second = 0;
        }

        if (minute > 59) {
            hour += minute / 60;
            minute %= 60;
        } else if (minute < 0) {
            minute = 0;
        }

        if (hour > 23) {
            hour %= 24;
        } else if (hour < 0) {
            hour = 0;
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Accessor methods to get hour, mintue, and second
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // Mutator methods to set hour, minute, and second
    public void setHour(int hour) {
        if (hour < 0) {
            hour = 0;
        } else if (hour > 23) {
            hour %= 24;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0) {
            minute = 0;
        } else if (minute > 59) {
            minute %= 60;
            this.hour += minute / 60;
            if (this.hour > 23) {
                this.hour %= 24;
            }
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0) {
            second = 0;
        } else if (second > 59) {
            second %= 60;
            this.minute += second / 60;
            if (this.minute > 59) {
                this.minute %= 60;
                this.hour += this.minute / 60;
                if (this.hour > 23) {
                    this.hour %= 24;
                }
            }
        }
        this.second = second;
    }

    // Method that create a string in 24-hour format
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
    
    // Method that creates a string in 12-hour format
    public String toString12() {
        String period = (this.hour >= 12) ? "P.M." : "A.M.";
        int displayHour = (this.hour == 0 || this.hour == 12) ? 12 : this.hour % 12;
        return String.format("%02d:%02d:%02d %s", displayHour, this.minute, this.second, period);
    }

    // Method that advances the clock by a the input of seconds and checks that every time interval gets updated
    public void advance(int seconds) {
        if (seconds > 0) {
            this.second += seconds;
            this.minute += this.second / 60;
            this.second %= 60;

            this.hour += this.minute / 60;
            this.minute %= 60;

            this.hour %= 24;
        }
    }
    
    // Method that compares the current clockTime with the values of the one in the parameters.
    public boolean equals(ClockTime otherTime) {
        return (this.hour == otherTime.getHour() &&
                this.minute == otherTime.getMinute() &&
                this.second == otherTime.getSecond());
    }
}
