package com.twu.biblioteca.books;


import com.twu.biblioteca.console.Messages;

import java.util.ArrayList;
import java.util.List;

public class BooksManager {

    Messages messages = new Messages();
    List<Book> bookListToCheckout = new ArrayList<>();


    public List<Book> addBookInList(Book book) {


        bookListToCheckout.add(book);


        return bookListToCheckout;
    }

    public List<Book> getBookListToCheckout() {

        return bookListToCheckout;


    }

    public void printListOfBookInATable(List<Book> bookList) {

        System.out.println("| ID  |      Book Name  |      Book's Author |    Year Published   |");

        for (Book book : bookList) {

            System.out.println(
                    "| --- | ------------- | ------------- | ------------- |\n" +
                            "| " + book.getBookID() + "  | " + book.getBookName() + " | " + book.getAuthor() + " | " + book.getYearPublished() + " |");


        }

    }


    public String checkoutBook(String bookID) {

        String message = "";

        for (int count = 0; count < bookListToCheckout.size(); count++) {

            if (bookListToCheckout.get(count).getBookID() == bookID) {

                if (bookListToCheckout.get(count).isAvailable()) {
                    bookListToCheckout.remove(count);
                    bookListToCheckout = bookListToCheckout;

                    bookListToCheckout.get(count).setAvailable(false);

                    message = messages.showCheckoutSuccessMessage();

                } else {

                    message = messages.showCheckoutNotAvailableBook();
                }

            } else {

                message = messages.showCheckoutNotAvailableBook();
            }


        }

        return message;

    }


}
