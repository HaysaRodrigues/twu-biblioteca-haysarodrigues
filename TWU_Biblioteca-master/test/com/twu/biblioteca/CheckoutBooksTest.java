package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import com.twu.biblioteca.console.Messages;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CheckoutBooksTest {

    @Test
    public void validateThat_checkoutBook_WillRemoveTheBookAfterCheckoutFromTheList() {

        BooksManager booksManager = new BooksManager();
        String removedBookID = "13";
        String leftBookID = "11";
        List<Book> listBeforeCheckout;

        listBeforeCheckout = booksManager.addBookInList(new Book("22", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        listBeforeCheckout = booksManager.addBookInList(new Book("11", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        listBeforeCheckout = booksManager.addBookInList(new Book("13", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));


        listBeforeCheckout = booksManager.checkoutBook(removedBookID);
        String expectedNextBookID = listBeforeCheckout.get(1).getBookID();


        Assert.assertEquals(expectedNextBookID, leftBookID);

    }


    @Test
    public void validateThat_checkoutBookWontDelete_IfTryToCheckoutAnInvalidBookID() {

        BooksManager booksManager = new BooksManager();
        String removedBookID = "8";
        List<Book> listBeforeCheckout;

        listBeforeCheckout = booksManager.addBookInList(new Book("22", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        listBeforeCheckout = booksManager.addBookInList(new Book("11", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        listBeforeCheckout = booksManager.addBookInList(new Book("13", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));


        listBeforeCheckout = booksManager.checkoutBook(removedBookID);
        boolean expectedNextBookID = listBeforeCheckout.get(1).getBookID() == "8";

        Assert.assertEquals(expectedNextBookID, false);

    }

    @Test
    public void validateThat_showCheckoutSuccessMessage_WillReturnASuccessMessage() {

        Messages messages = new Messages();
        String expectedMessage = "***** Thank you! Enjoy the book. *****";

        String actualMessage = messages.showCheckoutSuccessMessage();

        Assert.assertEquals(expectedMessage, actualMessage);

    }


}


