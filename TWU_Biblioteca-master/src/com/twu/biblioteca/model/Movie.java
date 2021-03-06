package com.twu.biblioteca.model;

public class Movie {

    private int movieID;
    private String movieName;
    private int movieYear;
    private String movieDirector;
    private int movieRating;
    private boolean isAvailable = true;

    public Movie(int movieID, String movieName, int movieYear, String movieDirector, int movieRating, boolean isAvailable) {

        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
        this.isAvailable = isAvailable;
    }

    public Movie(int movieID, String movieName, int movieYear, String movieDirector, boolean isAvailable) {

        this.movieID = movieID;
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.isAvailable = isAvailable;

    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String details() {
        return String.format("%-20s %-20s %-20s %-20s %n", movieName, movieDirector, movieYear, movieRating);
    }


}
