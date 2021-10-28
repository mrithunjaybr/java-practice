package com.tutorials;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(30);
        MotorBike honda = new MotorBike(10);
        MotorBike somethinElse = new MotorBike();
        System.out.printf("%d",ducati.getSpeed("ducat")).println();
        System.out.printf("%d",honda.getSpeed("honda")).println();
        System.out.printf("%d",somethinElse.getSpeed("Nothing")).println();

        ducati.start();
        honda.start();
        ducati.setSpeed(100);
        honda.setSpeed(80);

        System.out.printf("%d", ducati.getSpeed("ducati")).println();
        System.out.printf("%d", honda.getSpeed("honda")).println();

        ducati.increaseSpeed();
        System.out.printf("%d", ducati.getSpeed("ducati")).println();
        honda.increaseSpeed();
        System.out.printf("%d", honda.getSpeed("honda")).println();





    }
}
