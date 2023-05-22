public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time addTime(int hour, int minute, int second) {
        int newHour = this.hour + hour;
        int newMinute = this.minute + minute;
        int newSecond = this.second + second;

        if (newSecond >= 60) {
            newSecond %= 60;
            newMinute++;
        }
        if (newMinute >= 60) {
            newMinute %= 60;
            newHour++;
        }
        if (newHour >= 24) {
            newHour %= 24;
        }

        return new Time(newHour, newMinute, newSecond);
    }

    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString() {
        String hourString = (hour < 10) ? "0" + hour : String.valueOf(hour);
        String minuteString = (minute < 10) ? "0" + minute : String.valueOf(minute);
        String secondString = (second < 10) ? "0" + second : String.valueOf(second);
        return hourString + ":" + minuteString + ":" + secondString;
    }

    public Time nextSecond() {
        return addTime(0, 0, 1);
    }

    public Time previousSecond() {
        return addTime(0, 0, -1);
    }
}
