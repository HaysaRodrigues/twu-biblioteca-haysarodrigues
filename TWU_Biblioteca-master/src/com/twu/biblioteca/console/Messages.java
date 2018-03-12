package com.twu.biblioteca.console;

public class Messages {

    public String showWelcomeMessage() {

        String message = "\n ***** Welcome To The Bangalore Public Library ***** \n";

        return message;
    }

    public String showCheckoutSuccessMessage() {

        String message = "***** Thank you! Enjoy the book. *****";

        return message;
    }

    public String showCheckoutNotAvailableBook() {

        String message = "***** (!) That book is not available (!) *****";

        return message;
    }
}
