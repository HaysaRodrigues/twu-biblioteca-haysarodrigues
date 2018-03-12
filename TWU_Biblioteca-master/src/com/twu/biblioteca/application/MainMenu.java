package com.twu.biblioteca.application;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import com.twu.biblioteca.console.Messages;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Messages messages = new Messages();
        System.out.println(messages.showWelcomeMessage());

        BooksManager booksManager = new BooksManager();
        List<Book> bookList = booksManager.addBookInList(new Book("1", "O Pequeno Príncipe em Cordel", "Josué Limeira e Vladimir Barros", "2000"));

        Scanner scan = new Scanner(System.in);

        int selection = 0;

        do {

            System.out.println(" \n Main Menu ");
            System.out.println("  [1] - List Books");
            System.out.println("  [2] - Quit");

            System.out.println("\n Insert number option: \n");
            selection = scan.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("\n List of Available Books \n");
                    bookList = booksManager.getBooksList();
                    booksManager.printListOfBookInATable(bookList);

                    break;

                case 2:
                    Scanner scanBookID = new Scanner(System.in);
                    System.out.println("\n Insert ID book to checkout:  \n");
                    String bookID = scanBookID.next();
                    bookList = booksManager.checkoutBook(bookID, "N");
                    System.out.println("\n Thank you! Enjoy the book. \n");

                    break;

                case 3:
                    System.out.println(" ------ By By ------");
                    break;

                default:
                    System.out.println("\n Select a valid option! \n");
                    break;
            }

        } while (selection != 2);

    }


}
