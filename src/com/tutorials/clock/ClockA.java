package com.tutorials.clock;

public class ClockA{
    private ClockHand hours;
    private final ClockHand seconds;
    private ClockHand minutes;

    public ClockA() {
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public  void advance(){
        this.seconds.advance();

        if(this.seconds.value()==0) {
            this.minutes.advance();


            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }

    }
}
