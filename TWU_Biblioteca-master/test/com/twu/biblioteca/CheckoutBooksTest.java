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
        String removedBookID = "13";
        String leftBookID = "11";
        List<Book> listBeforeCheckout;

        listBeforeCheckout = booksManager.addBookInList(new Book("22", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        listBeforeCheckout = booksManager.addBookInList(new Book("11", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        listBeforeCheckout = booksManager.addBookInList(new Book("13", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));


        listBeforeCheckout = booksManager.checkoutBook(removedBookID, "Y");
        String expectedNextBookID = listBeforeCheckout.get(1).getBookID();


        Assert.assertEquals(expectedNextBookID, leftBookID);

    }


}


