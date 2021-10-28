package com.composition;

public class Review {

    private final int rating;
    private final String description;
    private final String id ;

    public Review(String id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }
    public String toString(){
        return String.format("Book-ID : %s | Description : %s | Rating : %d", id, description,rating);
    }

}
