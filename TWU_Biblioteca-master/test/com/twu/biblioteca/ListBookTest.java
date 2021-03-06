package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.manager.BooksManager;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBookTest {

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList_WithNameBook() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook;
        expectedListBook = booksManager.addBookInList(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));

        List<Book> actualResult = booksManager.getBookListToCheckout();

        assertEquals(expectedListBook.get(0).getBookName(), actualResult.get(0).getBookName());

    }

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList_WithAuthorName() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook;
        booksManager.addBookInList(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        expectedListBook = booksManager.addBookInList(new Book("2", "Minha Querida Almofada", "Haysa Rodrigues", "2000", true));


        List<Book> actualResult = booksManager.getBookListToCheckout();

        assertEquals(expectedListBook.get(0).getAuthor(), actualResult.get(0).getAuthor());
        assertEquals(expectedListBook.get(1).getAuthor(), actualResult.get(1).getAuthor());

    }

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList_WithYearPublished() {

        BooksManager booksManager = new BooksManager();
        List<Book> expectedListBook;
        booksManager.addBookInList(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        expectedListBook = booksManager.addBookInList(new Book("2", "Minha Querida Almofada", "Haysa Rodrigues", "2000", true));


        List<Book> actualResult = booksManager.getBookListToCheckout();

        assertEquals(expectedListBook.get(0).getYearPublished(), actualResult.get(0).getYearPublished());
        assertEquals(expectedListBook.get(1).getYearPublished(), actualResult.get(1).getYearPublished());

    }

    @Test
    public void validateThat_addBookInList_willReturnAListOfBooksThatItWasAdd() {

        BooksManager booksManager = new BooksManager();
        List<Book> actualResultList;
        List<Book> expectedResultList = new ArrayList<>();
        expectedResultList.add(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));

        actualResultList = booksManager.addBookInList(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));

        assertEquals(expectedResultList.size(), actualResultList.size());


    }


}
