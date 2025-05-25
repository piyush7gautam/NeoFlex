package com.neoflex.model;

public class Movie {
    private String title;
    private String genre;
    private double rating;
    private String imageUrl;

    public Movie() {
        // No-argument constructor
    }

    public Movie(String title, String genre, double rating, String imageUrl) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}


