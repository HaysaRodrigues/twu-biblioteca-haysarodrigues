package com.twu.biblioteca.books;


import java.util.ArrayList;
import java.util.List;

public class BooksManager {


    List<String> booksList = new ArrayList<>();


    public List<String> getBooksList() {

        booksList.add("O Pequeno Príncipe em Cordel");
        booksList.add("Bichos Vermelhos");
        booksList.add("O Senhor Agora Vai Mudar de Corpo");
        return booksList;
    }
}
