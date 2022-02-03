package com.tutorials.apartments;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){
        int val = this.pricePerSquare * this.squares;
        int val2 = compared.pricePerSquare * compared.squares;

        return Math.abs(val - val2);
    }
}
