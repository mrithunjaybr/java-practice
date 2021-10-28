package com.oops;

import java.util.Scanner;

public class Fan {

    // states of the class
    private String make;
    private double radius;
    private String color;
    private boolean isOn = false;
    private int speed = 0 ;
    //constructor of the class
    Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;

    }

    // print the state
    public String toString(){
        return "Make : " + this.make + " " + "| Radius : " +  this.radius + " " + "| Color : " + this.color + " " +
        "| isOn : " + this.isOn + " | Speed : " + this.speed ;



    }

    public void isOn(boolean t){
        this.isOn = t;
    }

    public void switchOn(){
        this.isOn = true;
        this.speed = 5;
    }

    public void switchOff(){
        this.isOn = false;
        this.speed = 0;
    }

    public void changeSpeed(){
        System.out.println("Enter any value from 1 - 5");
        Scanner sc = new Scanner(System.in);
        this.speed = sc.nextInt();
           }
    }



