package com.interfaces.exercise;

public class Runner {
    public static void main(String[] args) {
        Flyable[] flyingobj = {new Bird(), new Aeroplane()};
        for ( Flyable  i : flyingobj){
            i.fly();
        }
    }
}
