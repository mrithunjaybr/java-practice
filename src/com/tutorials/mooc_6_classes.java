package com.tutorials;

public class mooc_6_classes {
    public static void main(String[] args) {
        Account art = new Account("Arto", 100.00);
        Account artswiss = new Account("Arto's swiss", 100000.00);

        System.out.println("Initial state");
        System.out.println(art);
        System.out.println(artswiss);

        art.withdraw(20);
        artswiss.deposit(200);

        System.out.println("End state");
        System.out.println(art);
        System.out.println(artswiss);
    }
}
