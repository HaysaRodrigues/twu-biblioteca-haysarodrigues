package com.twu.biblioteca;


import com.twu.biblioteca.console.Messages;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeMessageTest {

    @Test
    public void validateThat_generateWelcomeMessage_WillReturnAWelcomeMessage() {

        Messages messages = new Messages();
        String expectedResult = "Welcome To The Bangalore Public Library";
        String actualResult;

        actualResult = messages.showWelcomeMessage();

        assertEquals(expectedResult, actualResult);
    }
}
