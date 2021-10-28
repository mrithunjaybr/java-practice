package com.composition;

import java.util.ArrayList;

public class Books {
    private final String id;
    private final String bookName;
    private final String author;
    private final ArrayList<Review> reviews = new ArrayList<>();

    public Books(String id, String bookName, String author) {
        this.id = id;
        this.bookName= bookName;
        this.author = author;
    }

    public void addReview(Review obj) {
        this.reviews.add(obj);
        System.out.println(obj);
    }

    @Override
    public String toString() {
        return "Books{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
