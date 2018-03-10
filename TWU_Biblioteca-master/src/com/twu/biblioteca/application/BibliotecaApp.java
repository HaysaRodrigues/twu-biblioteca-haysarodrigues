package com.twu.biblioteca.application;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import com.twu.biblioteca.console.Messages;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        Messages messages = new Messages();
        System.out.println(messages.showWelcomeMessage());


        List<Book> bookList;
        BooksManager booksManager = new BooksManager();

        bookList = booksManager.getBooksList();
        booksManager.printListOfBookInATable(bookList);


    }


}
