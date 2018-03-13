package com.twu.biblioteca.books;


import com.twu.biblioteca.console.Messages;

import java.util.ArrayList;
import java.util.List;

public class BooksManager {

    Messages messages = new Messages();
    List<Book> bookListToCheckout = new ArrayList<>();
    List<Book> unavailableBookList = new ArrayList<>();


    public List<Book> addBookInList(Book book) {


        bookListToCheckout.add(book);


        return bookListToCheckout;
    }

    public List<Book> addBookInUnavailableBookList(Book book) {

        unavailableBookList.add(book);

        return unavailableBookList;
    }


    public List<Book> getBookListToCheckout() {

        return bookListToCheckout;
    }

    public List<Book> getUnavailableBookList() {
        return unavailableBookList;
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

                    addBookInUnavailableBookList(bookListToCheckout.get(count));

                    bookListToCheckout.remove(count);
                    bookListToCheckout = bookListToCheckout;

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


    public String returnBookToTheLibrary(String bookIDToReturn) {

        String message = "";

        for (int count = 0; count < unavailableBookList.size(); count++) {

            if (unavailableBookList.get(count).getBookID() == bookIDToReturn) {

                addBookInList(unavailableBookList.get(count));

                unavailableBookList.remove(count);

                unavailableBookList = unavailableBookList;

                message = "";
            } else {

                message = ;
            }
        }


        return message;
    }
}
