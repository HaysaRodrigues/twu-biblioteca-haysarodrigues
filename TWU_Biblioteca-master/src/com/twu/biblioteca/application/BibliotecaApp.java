package com.twu.biblioteca.application;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {


        BooksManager booksManager = new BooksManager();


        System.out.println("| Book Name  | Book's Author | Year Published     |");

        for (Book book : booksManager.getBooksList()) {

            System.out.println(
                    "| ------------- | ------------- | ------------- |\n" +
                            "| " + book.getBookName() + " | " + book.getAuthor() + " | " + book.getYearPublished() + " |");


        }

    }


}
