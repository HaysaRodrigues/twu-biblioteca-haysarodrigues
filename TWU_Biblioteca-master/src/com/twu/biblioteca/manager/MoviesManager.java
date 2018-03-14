package com.twu.biblioteca.manager;

import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoviesManager {

    List<Movie> movieAvailableList = new ArrayList<>();

    public void addMovieInMovieAvailableList(Movie movie) {
        movieAvailableList.add(movie);
    }

    public List<Movie> getMovieAvailableList() {
        return movieAvailableList;
    }

    public List<Movie> listAvailableMovies() {
        return getMovieAvailableList().stream().filter(movie -> movie.isAvailable()).collect(Collectors.toList());
    }

    public static String formatListWithHeader() {
        return String.format("%-20s %-20s %-20s %-20s %n", "Movie Name", "Movie Director", "Movie Year", "Movie Rating");

    }
}
