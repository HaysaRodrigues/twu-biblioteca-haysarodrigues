package com.twu.movies;

import com.twu.biblioteca.manager.MoviesManager;
import com.twu.biblioteca.model.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DetailsMoviesTest {

    Movie movie;
    Movie movieWithoutRating;

    @Before
    public void setup() {
        movie = new Movie(1, "Um amor para recordar", 2000, "Chiquinha", 8, true);
        movieWithoutRating = new Movie(2, "Um amor para recordar", 2000, "Chiquinha", true);
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
    public void validateThat_movieDetails_willHaveAisAvailable() {

        int expectedMovieDirector = 8;
        int actualMovieName = movie.getMovieRating();

        Assert.assertEquals(expectedMovieDirector, actualMovieName);
    }


    @Test
    public void validateThat_movieDetails_canBeReturnedWithoutRating() {
        Assert.assertEquals(0, movieWithoutRating.getMovieRating());

    }

    @Test
    public void validateThat_movieDetails_WillBeFormattedInLine() {

        String expectedFormat = "Um amor para recordar Chiquinha            2000                 8                    \n";
        Assert.assertEquals(expectedFormat, movie.details());
    }


    @Test
    public void validateThat_movieDetailsList_willBeFormattedWithHeader() {
        String header = "Movie Name           Movie Director       Movie Year           Movie Rating         \n";
        Assert.assertEquals(header, MoviesManager.formatListWithHeader());

    }


}
