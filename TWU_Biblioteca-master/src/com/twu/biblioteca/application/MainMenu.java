package com.twu.biblioteca.application;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.manager.BooksManager;
import com.twu.biblioteca.console.Messages;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Messages messages = new Messages();
        System.out.println(messages.showWelcomeMessage());

        BooksManager booksManager = new BooksManager();

        List<Book> bookListAvailables;
        booksManager.addBookInList(new Book("18", "The Handmaid's Tale ", "Girl", "2000", true));
        booksManager.addBookInList(new Book("98", "The Bell Jar ", "Girl", "2000", true));
        booksManager.addBookInList(new Book("45", "Jane Eyre", "Girl", "2000", true));
        bookListAvailables = booksManager.addBookInList(new Book("10", "The Second Sex ", "Girl", "2000", true));

        Scanner menuNumberFromUser = new Scanner(System.in);

        int selection = 0;


        do {

            System.out.println(" \n Main Menu ");
            System.out.println("  [1] - List Books");
            System.out.println("  [2] - Checkout Book");
            System.out.println("  [3] - Return Book");
            System.out.println("  [4] - Checkout Movie");
            System.out.println("  [5] - Quit");

            System.out.println("\n Insert number option: \n");
            selection = menuNumberFromUser.nextInt();

            switch (selection) {

                case 1:
                    booksManager.printListOfBookInATable(bookListAvailables);
                    break;

                case 2:
                    Scanner bookIDFromUser = new Scanner(System.in);
                    System.out.println("Type the book ID you want to check-out:");
                    String bookToRemoveInCheckout = bookIDFromUser.nextLine();

                    System.out.println(booksManager.checkoutBook(bookToRemoveInCheckout));
                    break;

                case 3:

                    Scanner bookIDReturnFromUser = new Scanner(System.in);
                    System.out.println("Type the book ID you want to return:");
                    String bookIDToReturn = bookIDReturnFromUser.nextLine();

                    System.out.println(booksManager.returnBookToTheLibrary(bookIDToReturn));
                    break;

                case 4:
                    //TODO Checkout Movie
                    break;

                case 5:
                    System.out.println(" ------ By By ------");
                    break;

                default:
                    System.out.println("\n Select a valid option! \n");
                    break;
            }

        } while (selection != 5);

    }
}
