package com.tutorials.clock;

public class mooc_8_clock {
    public static void main(String[] args) {
        ClockA clock = new ClockA();

        while (true){
            System.out.println(clock);
            clock.advance();
        }
    }
}
