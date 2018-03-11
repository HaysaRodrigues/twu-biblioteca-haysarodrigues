package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckoutBooksTest {

    @Test
    public void validateThat_checkoutBooks_WillLetCheckoutABook() {

        BooksManager booksManager = new BooksManager();
        String bookID = "10";
        List<Book> expectedListAfterCheckout = new ArrayList<>();
        expectedListAfterCheckout.add(new Book("10", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        expectedListAfterCheckout.add(new Book("22", "Minha Querida Almofada", "Haysa Rodrigues", "2000"));


        List<Book> actualListOfBooks = booksManager.checkoutBook(bookID);
        String expectedNextBookName = expectedListAfterCheckout.get(1).getBookID();


        Assert.assertEquals(expectedNextBookName, actualListOfBooks.get(0).getBookID());

    }


    @Test
    public void validateThat_checkoutBooks_WillLetCheckoutABookAndTheBookWillNotAppearAnymoreInTheList() {

    }
}


