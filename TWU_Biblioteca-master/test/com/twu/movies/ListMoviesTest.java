package com.twu.movies;

import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListMoviesTest {

    Movie movie;
    Movie movieWithoutRating;

    @Before
    public void setup() {
        movie = new Movie("Um amor para recordar", 2000, "Chiquinha", 8);
        movieWithoutRating = new Movie("Um amor para recordar", 2000, "Chiquinha");
    }

    @Test
    public void validateThat_movieDetails_willHaveMovieName() {

        String expectedMovieName = "Um amor para recordar";
        String actualMovieName = movie.getMovieName();

        Assert.assertEquals(expectedMovieName, actualMovieName);

    }

    @Test
    public void validateThat_movieDetails_willHaveMovieYear() {

        int expectedMovieYear = 2000;
        int actualMovieName = movie.getMovieYear();

        Assert.assertEquals(expectedMovieYear, actualMovieName);

    }

    @Test
    public void validateThat_movieDetails_willHaveMovieDirector() {

        String expectedMovieDirector = "Chiquinha";
        String actualMovieName = movie.getMovieDirector();

        Assert.assertEquals(expectedMovieDirector, actualMovieName);

    }

    @Test
    public void validateThat_movieDetails_willHaveMovieRating() {


        int expectedMovieDirector = 8;
        int actualMovieName = movie.getMovieRating();

        Assert.assertEquals(expectedMovieDirector, actualMovieName);
    }


    @Test
    public void validateThat_movieDetails_canBeReturnedWithoutRating() {
        Assert.assertEquals(0, movieWithoutRating.getMovieRating());

    }


}
