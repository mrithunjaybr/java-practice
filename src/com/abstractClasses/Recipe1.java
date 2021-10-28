package com.abstractClasses;

public class Recipe1 extends AbstractRecipe{

    @Override
    protected void getReady() {
        System.out.println("Preparing the reqs.");
    }

    @Override
    protected void doTheDish() {
        System.out.println("Cooking");
    }

    @Override
    protected void cleanUp() {
        System.out.println("Cleaning Up");
    }
}
