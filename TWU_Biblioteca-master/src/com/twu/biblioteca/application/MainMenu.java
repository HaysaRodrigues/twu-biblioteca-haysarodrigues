package com.twu.biblioteca.application;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BooksManager;
import com.twu.biblioteca.console.Messages;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

//    public static void main(String[] args) {
//
//        Messages messages = new Messages();
//        System.out.println(messages.showWelcomeMessage());
//
//        BooksManager booksManager = new BooksManager();
//
//        List<Book> bookList;
//        bookList = booksManager.addBookInList(new Book("18", "The Handmaid's Tale ", "Girl", "2000"));
//        bookList = booksManager.addBookInList(new Book("98", "The Bell Jar ", "Girl", "2000"));
//        bookList = booksManager.addBookInList(new Book("45", "Jane Eyre", "Girl", "2000"));
//        bookList = booksManager.addBookInList(new Book("10", "The Second Sex ", "Girl", "2000"));
//
//        Scanner menuNumberFromUser = new Scanner(System.in);
//        Scanner yesOrNot = new Scanner(System.in);
//        Scanner bookIDFromUser = new Scanner(System.in);
//
//        int selection = 0;
//
//
//        do {
//
//            System.out.println(" \n Main Menu ");
//            System.out.println("  [1] - List Books");
//            System.out.println("  [2] - Quit");
//
//            System.out.println("\n Insert number option: \n");
//            selection = menuNumberFromUser.nextInt();
//
//            switch (selection) {
//
//                case 1:
//                    System.out.println("\n List of Available Books \n");
//                    bookList = booksManager.getBookListToCheckout();
//                    booksManager.printListOfBookInATable(bookList);
//                    System.out.println("\n Do you want to checkout a book? Y/N \n");
//                    String answerYorN = yesOrNot.next();
//
//                    if (answerYorN.equals("Y")) {
//
//                        System.out.println("\n What book ID do you want do check-out: \n");
//                        //TODO the scan can't read the value of ID book checkout. HELP WANTED.
//
//                        String bookIDToCheckout = bookIDFromUser.nextLine();
//                        bookList = booksManager.checkoutBook(bookIDToCheckout);
//                    }
//
//
//                    break;
//
//                case 2:
//                    System.out.println(" ------ By By ------");
//                    break;
//
//                default:
//                    System.out.println("\n Select a valid option! \n");
//                    break;
//            }
//
//        } while (selection != 2);
//
//    }


}
