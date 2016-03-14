package com.example.parakh.nocturnalcafe;

/**
 * Created by Parakh on 10-03-2016.
 */
public class Movie {
    private String title, genre, year;

    public Movie() {
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
