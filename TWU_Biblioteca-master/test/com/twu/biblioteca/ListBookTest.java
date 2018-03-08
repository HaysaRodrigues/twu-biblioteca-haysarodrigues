package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBookTest {

    @Test
    public void validateThat_ItWillBeAbleToSeeAllBooksList() {

        BooksManager booksManager = new BooksManager();
        List<String> expectedListBook = new ArrayList<>();
        expectedListBook.add("O Pequeno Príncipe em Cordel");
        expectedListBook.add("Bichos Vermelhos");
        expectedListBook.add("O Senhor Agora Vai Mudar de Corpo");

        List<String> actualResult = booksManager.getBooksList();

        assertEquals(expectedListBook, actualResult);

    }
}
