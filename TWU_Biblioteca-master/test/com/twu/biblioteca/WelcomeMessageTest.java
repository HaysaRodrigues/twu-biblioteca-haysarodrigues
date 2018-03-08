package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeMessageTest {

    @Test
    public void validateThat_generateWelcomeMessage_WillReturnAWelcomeMessage() {

        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        String expectedResult = "Welcome To The Bangalore Public Library";
        String actualResult;

        actualResult = bibliotecaApp.showWelcomeMessage();

        assertEquals(expectedResult, actualResult);
    }
}
