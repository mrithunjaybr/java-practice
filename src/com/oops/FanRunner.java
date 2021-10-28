package com.oops;

public class FanRunner {
    public static void main(String[] args) {
        Fan obj1 = new Fan("Brand_1", 5.5, "Blue");
        System.out.println(obj1);
        obj1.switchOn();
        obj1.changeSpeed();
        System.out.println(obj1);

    }
}
