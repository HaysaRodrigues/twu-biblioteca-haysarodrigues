package com.twu.movies;

import com.twu.biblioteca.manager.MoviesManager;
import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ListMoviesTest {

    MoviesManager moviesManager;
    Movie movieWithRating;
    Movie movieWithoutRating;

    @Before
    public void setup() {

        moviesManager = new MoviesManager();

        movieWithRating = new Movie("Um amor para recordar", 2000, "Chiquinha", 8, true);
        movieWithoutRating = new Movie("Um amor para recordar", 2000, "Chiquinha", true);
        moviesManager.addMovieInMovieAvailableList(movieWithRating);
        moviesManager.addMovieInMovieAvailableList(movieWithoutRating);

    }

    @Test
    public void validateThat_itWillAppear_availableMovieList() {

        List<Movie> actualMovieList = moviesManager.listAvailableMovies();

        Assert.assertEquals(2, actualMovieList.size());

    }

    @Test
    public void validateThat_itWillNotAppear_unavailableMovieList() {

        movieWithoutRating.setAvailable(false);
        List<Movie> actualMovieList = moviesManager.listAvailableMovies();

        Assert.assertEquals(1, actualMovieList.size());

    }
}
