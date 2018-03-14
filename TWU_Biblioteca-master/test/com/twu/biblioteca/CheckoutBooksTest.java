package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.manager.BooksManager;
import com.twu.biblioteca.console.Messages;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CheckoutBooksTest {

    @Test
    public void validateThat_checkoutBook_WillRemoveTheBookAfterCheckoutFromTheList() {

        Messages messages = new Messages();
        BooksManager booksManager = new BooksManager();
        String bookToRemoveInCheckout = "13";
        int expectedListSizeAfterRemove = 3;
        List<Book> listBeforeCheckout;

        listBeforeCheckout = booksManager.addBookInList(new Book("22", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("11", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("13", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("8", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", false));


        String actualMessage = booksManager.checkoutBook(bookToRemoveInCheckout);
        String expectedMessage = messages.showCheckoutSuccessMessage();
        int actualListSize = listBeforeCheckout.size();


        Assert.assertEquals(expectedListSizeAfterRemove, actualListSize);
        Assert.assertEquals(expectedMessage, actualMessage);

    }


    @Test
    public void validateThat_checkoutBookWontDelete_IfTryToCheckoutAnInvalidBookID() {

        Messages messages = new Messages();
        BooksManager booksManager = new BooksManager();
        String removedBookID = "8";
        List<Book> listBeforeCheckout;

        listBeforeCheckout = booksManager.addBookInList(new Book("22", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("11", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("13", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", false));


        String expectedMessage = booksManager.checkoutBook(removedBookID);
        boolean actualNextBookID = listBeforeCheckout.get(1).getBookID().equals("8");

        Assert.assertEquals(false, actualNextBookID);
        Assert.assertEquals(expectedMessage, messages.showCheckoutNotAvailableBook());

    }

    @Test
    public void validateThat_showCheckoutSuccessMessage_WillReturnASuccessMessage() {

        Messages messages = new Messages();
        String expectedMessage = "***** Thank you! Enjoy the book. *****";

        String actualMessage = messages.showCheckoutSuccessMessage();

        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void validateThat_showCheckoutNotAvailableBook_WillReturnAInvalidMessageWhenTheBookIsNotAvailable() {

        Messages messages = new Messages();
        String expectedMessage = "***** (!) That book is not available (!) *****";

        String actualMessage = messages.showCheckoutNotAvailableBook();

        Assert.assertEquals(expectedMessage, actualMessage);

    }


    @Test
    public void validateThat_checkoutBook_WillReturnAnInvalidMessageWhenTheBookIsNotAvailable() {

        BooksManager booksManager = new BooksManager();
        Messages messages = new Messages();
        String bookIDToCheckAvailability = "8";
        List<Book> listBeforeCheckout;

        listBeforeCheckout = booksManager.addBookInList(new Book("22", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("11", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("13", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", true));
        listBeforeCheckout = booksManager.addBookInList(new Book("8", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000", false));


        String expectedMessage = messages.showCheckoutNotAvailableBook();
        String actualMessage = booksManager.checkoutBook(bookIDToCheckAvailability);

        Assert.assertEquals(expectedMessage, actualMessage);


    }


}


