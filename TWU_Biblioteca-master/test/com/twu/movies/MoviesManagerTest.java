package com.twu.movies;

import com.twu.biblioteca.manager.MoviesManager;
import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoviesManagerTest {


    MoviesManager moviesManager;
    MoviesManager moviesManagerEmpty;
    Movie movieWithRating;
    Movie movieWithoutRating;

    @Before
    public void setup() {

        moviesManager = new MoviesManager();
        moviesManagerEmpty = new MoviesManager();
        movieWithRating = new Movie("Um amor para recordar", 2000, "Chiquinha", 8, true);
        movieWithoutRating = new Movie("Um amor para recordar", 2000, "Chiquinha", true);
        moviesManager.addMovieInMovieAvailableList(movieWithRating);
        moviesManager.addMovieInMovieAvailableList(movieWithoutRating);

    }

    @Test
    public void validateThat_moviesList_WillBeFormattedAndWillShowMovieList() {

        String expectedList = "";
        Assert.assertEquals(expectedList, moviesManager.moviesListAvailableFormatted());

    }

    @Test
    public void validateThat_moviesList_WillThrowMessageWhenThereAreNoMovies() {

        String expectedMessage = "There aren't book available.";
        Assert.assertEquals(expectedMessage, moviesManagerEmpty.moviesListAvailableFormatted());

    }
}
