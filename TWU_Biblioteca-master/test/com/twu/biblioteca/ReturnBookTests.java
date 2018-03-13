package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.BooksManager;
import com.twu.biblioteca.console.Messages;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ReturnBookTests {

    @Test
    public void validateThat_ItWillBeAbleToReturnABook_AndItWillAppearInTheListOfAvailableBooks() {

        BooksManager booksManager = new BooksManager();
        List<Book> listOfAvailableBooks;

        String bookIDToCheckout = "67";
        String bookIDToReturn = "67";

        listOfAvailableBooks = booksManager.addBookInList(new Book("18", "The Handmaid's Tale ", "Girl", "2000", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("23", "The Handmaid's Tale ", "Girl", "1999", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("67", "The Handmaid's Tale ", "Girl", "1934", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("90", "The Handmaid's Tale ", "Girl", "1887", false));

        booksManager.checkoutBook(bookIDToCheckout);
        booksManager.returnBookToTheLibrary(bookIDToReturn);

        Assert.assertEquals(0, booksManager.getUnavailableBookList().size());

    }

    @Test
    public void validateThat_ItWillReturnASuccessMessage_WhenTheBookReturnedBelongsToTheLibrary() {

        Messages messages = new Messages();
        BooksManager booksManager = new BooksManager();
        List<Book> listOfAvailableBooks;

        String bookIDToCheckout = "23";
        String bookIDToReturn = "23";

        listOfAvailableBooks = booksManager.addBookInList(new Book("18", "The Handmaid's Tale ", "Girl", "2000", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("23", "The Handmaid's Tale ", "Girl", "1999", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("67", "The Handmaid's Tale ", "Girl", "1934", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("90", "The Handmaid's Tale ", "Girl", "1887", false));

        booksManager.checkoutBook(bookIDToCheckout);
        String actualSuccessMessage = booksManager.returnBookToTheLibrary(bookIDToReturn);

        Assert.assertEquals(messages.showReturnBookSuccessMessage(), actualSuccessMessage);


    }

    @Test
    public void validateThat_ItWillReturnAnUnsuccessfulMessage_WhenTheBookDoNotBelongsToTheLibrary() {

        Messages messages = new Messages();
        BooksManager booksManager = new BooksManager();
        List<Book> listOfAvailableBooks;

        String bookIDToCheckout = "23";
        String bookIDToReturn = "12";

        listOfAvailableBooks = booksManager.addBookInList(new Book("18", "The Handmaid's Tale ", "Girl", "2000", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("23", "The Handmaid's Tale ", "Girl", "1999", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("67", "The Handmaid's Tale ", "Girl", "1934", true));
        listOfAvailableBooks = booksManager.addBookInList(new Book("90", "The Handmaid's Tale ", "Girl", "1887", false));

        booksManager.checkoutBook(bookIDToCheckout);
        String actualUnsuccessfulMessage = booksManager.returnBookToTheLibrary(bookIDToReturn);

        Assert.assertEquals(messages.showReturnBookUnsuccessfulMessage(), actualUnsuccessfulMessage);


    }
}
