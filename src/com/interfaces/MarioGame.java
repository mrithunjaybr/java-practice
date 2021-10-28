package com.interfaces;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Jumps");
    }

    @Override
    public void down() {
        System.out.println("Nothing");
    }

    @Override
    public void left() {
        System.out.println("Go Backward");
    }

    @Override
    public void right() {
        System.out.println("Go Forward");
    }
}
