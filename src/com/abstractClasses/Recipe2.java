package com.abstractClasses;

public class Recipe2 extends AbstractRecipe{
    @Override
    protected void getReady() {
        System.out.println("Preparing the recipe 2 reqs.");
    }

    @Override
    protected void doTheDish() {
        System.out.println("Cooking recipe 2 ");
    }

    @Override
    protected void cleanUp() {
        System.out.println("Cleaning Up things of recipe 2");
    }
}
