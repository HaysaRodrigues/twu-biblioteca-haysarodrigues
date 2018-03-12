package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import org.junit.Test;

import java.util.ArrayList;
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
        listOfAvailableBooks = booksManager.addBookInList(new Book("90", "The Handmaid's Tale ", "Girl", "1887", true));

        System.out.println(listOfAvailableBooks.size());

        listOfUnavailableBooks = booksManager.checkoutBook(bookIDToCheckout);

        booksManager.returnBookToTheLibrary(bookIDToReturn);

    }

    @Test
    public void validateThat_ItWillReturnASuccessMessage_WhenTheBookReturnedBelongsToTheLibrary() {

    }

    @Test
    public void validateThat_ItWillReturnAnUnsuccessfulMessage_WhenTheBookDoNotBelongsToTheLibrary() {

    }
}
