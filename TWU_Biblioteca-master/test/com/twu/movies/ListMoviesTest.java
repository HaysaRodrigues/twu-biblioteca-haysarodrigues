package com.twu.movies;

import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ListMoviesTest {

    MoviesManager moviesManager;
    Movie movie;
    Movie movieWithoutRating;
    List<Movie> movieAvailableList;

    @Before
    public void setup() {

        moviesManager = new MoviesManager();

        movie = new Movie("Um amor para recordar", 2000, "Chiquinha", 8);
        movieWithoutRating = new Movie("Um amor para recordar", 2000, "Chiquinha");
        movieAvailableList.add(movie);
        movieAvailableList.add(movieWithoutRating);
    }

    @Test
    public void validateThat_itWillAppear_availableMovieList() {


        movie = new Movie("Um amor para recordar", 2000, "Chiquinha", 8);


        List<Movie> actualMovieList = moviesManager.getMovieAvailableList();

        Assert.assertEquals(movieAvailableList.size(), actualMovieList.size());


    }
}
