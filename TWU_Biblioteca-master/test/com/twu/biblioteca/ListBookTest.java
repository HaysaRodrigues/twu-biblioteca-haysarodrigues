package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBookTest {

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList_WithNameBook() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook = new ArrayList<>();

        expectedListBook.add(new Book("1","O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        expectedListBook.add(new Book("2", "Minha Querida Almofada", "Josué Limeira e Vladimir Barros", "2000"));

        List<Book> actualResult = booksManager.getBooksList();

        assertEquals(expectedListBook.get(0).getBookName(), actualResult.get(0).getBookName());
        assertEquals(expectedListBook.get(1).getBookName(), actualResult.get(1).getBookName());

    }

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList_WithAuthorName() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook = new ArrayList<>();

        expectedListBook.add(new Book("1","O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        expectedListBook.add(new Book("2","Minha Querida Almofada", "Haysa Rodrigues", "2000"));

        List<Book> actualResult = booksManager.getBooksList();

        assertEquals(expectedListBook.get(0).getAuthor(), actualResult.get(0).getAuthor());
        assertEquals(expectedListBook.get(1).getAuthor(), actualResult.get(1).getAuthor());

    }

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList_WithYearPublished() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook = new ArrayList<>();

        expectedListBook.add(new Book("1","O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        expectedListBook.add(new Book("2","Minha Querida Almofada", "Haysa Rodrigues", "2000"));

        List<Book> actualResult = booksManager.getBooksList();

        assertEquals(expectedListBook.get(0).getYearPublished(), actualResult.get(0).getYearPublished());
        assertEquals(expectedListBook.get(1).getYearPublished(), actualResult.get(1).getYearPublished());

    }
}
