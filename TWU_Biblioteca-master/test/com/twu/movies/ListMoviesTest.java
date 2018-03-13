package com.twu.movies;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListMoviesTest {

    Movie movie;

    @Before
    public void setup() {
        movie = new Movie("Um amor para recordar", 2000, "Chiquinha", 8);
    }

    @Test
    public void validateThat_movieDetails_willHaveMovieName() {

        String expectedMovieName = "Um amor para recordar";
        String actualMovieName = movie.getMovieName();

        Assert.assertEquals(expectedMovieName, actualMovieName);


    }

    @Test
    public void validateThat_movieDetails_willHaveMovieYear() {
    }

    @Test
    public void validateThat_movieDetails_willHaveMovieDirector() {
    }

    @Test
    public void validateThat_movieDetails_willHaveMovieRating() {
    }

    @Test
    public void validateThat_movieDetails_canBeReturnedWithoutRating() {
    }


}
