package com.twu.biblioteca.books;


import java.util.ArrayList;
import java.util.List;

public class BooksManager {


    List<Book> booksList = new ArrayList<>();


    public List<Book> getBooksList() {


        booksList.add(new Book("10", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        booksList.add(new Book("22", "Minha Querida Almofada", "Haysa Rodrigues", "2000"));

        return booksList;


    }

    public void printListOfBookInATable(List<Book> bookList) {

        System.out.println("| Book Name  | Book's Author | Year Published     |");

        for (Book book : bookList) {

            System.out.println(
                    "| ------------- | ------------- | ------------- |\n" +
                            "| " + book.getBookName() + " | " + book.getAuthor() + " | " + book.getYearPublished() + " |");


        }

    }


    public List<Book> checkoutBook(String bookID) {

        booksList = getBooksList();


        for (int count = 0; count < booksList.size(); count++) {

            if (booksList.get(count).getBookID() == bookID) {
                booksList.remove(count);
            }
        }

        return booksList;

    }
}
