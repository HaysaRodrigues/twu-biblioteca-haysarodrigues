package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBookTest {

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook = new ArrayList<>();
        expectedListBook.add(new Book("O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));

        List<Book> actualResult = booksManager.getBooksList();

        assertEquals(expectedListBook.get(0).getBookName(), actualResult.get(0).getBookName());

    }
}
