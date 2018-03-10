package com.twu.biblioteca.books;


import java.util.ArrayList;
import java.util.List;

public class BooksManager {


    public List<Book> getBooksList() {

        List<Book> booksList = new ArrayList<>();

        booksList.add(new Book("O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));
        booksList.add(new Book("Minha Querida Almofada", "Haysa Rodrigues", "2000"));

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


}
