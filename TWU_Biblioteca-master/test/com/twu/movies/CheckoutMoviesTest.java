package com.twu.movies;

import com.twu.biblioteca.manager.MoviesManager;
import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutMoviesTest {


    MoviesManager moviesManager;
    Movie movieWithRating;
    Movie movieWithRating2;

    @Before
    public void setup() {

        moviesManager = new MoviesManager();
        movieWithRating = new Movie(1, "Um amor para recordar", 2000, "Chiquinha", 8, true);
        movieWithRating2 = new Movie(2, "Um amor para recordar", 2000, "Chiquinha", 8, true);
        moviesManager.addMovieInMovieAvailableList(movieWithRating);
        moviesManager.addMovieInMovieAvailableList(movieWithRating2);

    }


    @Test
    public void validateThat_WillBeAbleToCheckoutAMovie() {

        int movieID = 1;
        String expectedMessage = "Get the popcorn and enjoy the movie.";

        String actualMessage = moviesManager.checkoutMovie(movieID);
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void validateThat_WillBeAbleToCheckoutAMovieAndTheAvailabilityWillBeFalse() {

        int movieID = 1;
        String expectedMessage = "Get the popcorn and enjoy the movie.";

        String actualMessage = moviesManager.checkoutMovie(movieID);
        Assert.assertEquals(expectedMessage, actualMessage);
        Assert.assertEquals(false, moviesManager.getMovieAvailableList().get(0).isAvailable());

    }

}

