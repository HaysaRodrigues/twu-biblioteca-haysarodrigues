package com.twu.biblioteca.books;


import java.util.ArrayList;
import java.util.List;

public class BooksManager {


    List<Book> booksList = new ArrayList<>();


    public List<Book> getBooksList() {

        booksList.add(new Book("O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));

        return booksList;
    }
}
