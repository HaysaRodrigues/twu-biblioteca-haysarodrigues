package com.twu.biblioteca.model;

public class Movie {

    private String movieName;
    private int movieYear;
    private String movieDirector;
    private int movieRating;

    public Movie(String movieName, int movieYear, String movieDirector, int movieRating) {

        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    public Movie(String movieName, int movieYear, String movieDirector) {

        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
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


}
