package com.twu.biblioteca.books;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksManager {


    List<Book> booksList = new ArrayList<>();


    public List<Book> addBookInList(Book book) {


        booksList.add(book);


        return booksList;
    }

    public List<Book> getBooksList() {

        return booksList;


    }

    public void printListOfBookInATable(List<Book> bookList) {

        System.out.println(" | ID | Book Name  | Book's Author | Year Published     |");

        for (Book book : bookList) {

            System.out.println(
                    "| ------ | ------------- | ------------- | ------------- |\n" +
                            book.getBookID() + " | " + book.getBookName() + " | " + book.getAuthor() + " | " + book.getYearPublished() + " |");


        }

    }


    public List<Book> checkoutBook(String bookID, String answer) {
        
        if (answer == "Y") {

            for (int count = 0; count < booksList.size(); count++) {

                if (booksList.get(count).getBookID() == bookID) {
                    booksList.remove(count);
                    booksList = booksList;
                }
            }

        } else {

            System.out.println("\n Ok! ");
        }

        return booksList;

    }
}
