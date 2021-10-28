package com.abstractClasses;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 rep1 = new Recipe1();
        rep1.execute(); //abstraction takes place here
        Recipe2 rep2 = new Recipe2();
        rep2.execute(); // abstraction takes place here. Even though same function is called, different implementation takes place
    }
}
