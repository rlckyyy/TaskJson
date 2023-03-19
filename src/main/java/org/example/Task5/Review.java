package org.example.Task5;

public class Review {
    private int rating;
    private String comment;

    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public Review() {
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Review rating: " + rating + ", comment: " + comment;
    }
}
