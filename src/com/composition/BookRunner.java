package com.composition;

import java.awt.print.Book;

public class BookRunner {
    public static void main(String[] args) {
        Books book = new Books("001", "OOPS with Java", "Mj");
        book.addReview(new Review("001", "Awesome Read", 5));
        book.addReview(new Review("001","New Attempt",4));

        System.out.println(book);
    }
}
