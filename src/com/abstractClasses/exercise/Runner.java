package com.abstractClasses.exercise;

public class Runner {
    public static void main(String[] args) {
        Animal[] obj = {new Cat(),new Dog()};
        String h = "sda0";

        System.out.println(h.length());
        for (Animal i : obj){
            i.bark();
        }
    }
}
