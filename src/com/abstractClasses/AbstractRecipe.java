package com.abstractClasses;

public abstract class AbstractRecipe {

    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }

    protected abstract void getReady();

    protected abstract void doTheDish();

    protected abstract void cleanUp();
    //prepare
    //recipe
    //cleanUp

}
