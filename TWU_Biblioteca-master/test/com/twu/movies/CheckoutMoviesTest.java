package com.twu.movies;

import com.twu.biblioteca.manager.MoviesManager;
import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutMoviesTest {


    MoviesManager moviesManager;
    Movie movieWithRating;

    @Before
    public void setup() {

        moviesManager = new MoviesManager();
        movieWithRating = new Movie(1,"Um amor para recordar", 2000, "Chiquinha", 8, true);
        moviesManager.addMovieInMovieAvailableList(movieWithRating);

    }


    @Test
    public void validateThat_WillBeAbleToCheckoutAMovie() {

        int movieID = 1;
        String expectedMessage = "Get the popcorn and enjoy the movie.";

        String actualMessage = moviesManager.checkoutMovie(movieID);
        Assert.assertEquals(1, moviesManager.getMovieAvailableList().size());


    }

}

