package com.tutorials.apartments;

public class mooc_9_ApartmentRunner {
    public static void main(String[] args) {
        Apartment manhattanstudioApt = new Apartment(1,16,5500);
        Apartment atlantaTwobedroomApt = new Apartment(2,38,4200);
        Apartment bangorThreebedroomApt = new Apartment(3,78,2500);

        System.out.println(manhattanstudioApt.largerThan(atlantaTwobedroomApt));
        System.out.println(bangorThreebedroomApt.largerThan(atlantaTwobedroomApt));

        System.out.println(manhattanstudioApt.priceDifference(atlantaTwobedroomApt));
        System.out.println(bangorThreebedroomApt.priceDifference(atlantaTwobedroomApt));
    }
}
