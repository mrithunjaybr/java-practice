package com.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        /*
        Here same set of functions have been used for different games because internally it has been
        defined according to the class's needs.
         */
        //MarioGame mg = new MarioGame();
        ChessGame mg = new ChessGame();
        mg.up();
        mg.down();
        mg.right();
        mg.left();
    }

}
