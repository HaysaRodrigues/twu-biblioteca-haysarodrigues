package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CheckoutBooksTest {

    @Test
    public void validateThat_checkoutBooks_WillLetCheckoutABook() {

        BooksManager booksManager = new BooksManager();
        String bookID = "22";
        List<Book> expectedListAfterCheckout;
        expectedListAfterCheckout = booksManager.addBookInList(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));


        List<Book> actualListOfBooks = booksManager.checkoutBook(bookID);
        String expectedNextBookID = expectedListAfterCheckout.get(0).getBookID();


        Assert.assertEquals(expectedNextBookID, actualListOfBooks.get(0).getBookID());

    }


}


