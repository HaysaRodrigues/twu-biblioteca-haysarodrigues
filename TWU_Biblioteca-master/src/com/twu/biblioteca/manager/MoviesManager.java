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

    public String formatMoviesList(String details) {
        String format = formatListWithHeader();

        return format + details;

    }

    public String moviesListAvailableFormatted() {

        String message = "";

//TODO this method could improve because I'll do checkout after, why I am not using it in checkout method?
        if (listAvailableMovies().isEmpty()) {
            message = "There aren't book available.";
        } else if (!listAvailableMovies().isEmpty()) {

            for (Movie movie : listAvailableMovies()) {

                message = formatMoviesList(movie.details());

            }
        }
        return message;

    }

    public String checkoutMovie(int movieID) {

        String message = "";


        for (int count = 0; count < listAvailableMovies().size(); count++) {


            if (listAvailableMovies().get(count).getMovieID() == movieID) {

                listAvailableMovies().get(count).setAvailable(false);

                message = "Get the popcorn and enjoy the movie.";
            }

        }

        return message;
    }
}
