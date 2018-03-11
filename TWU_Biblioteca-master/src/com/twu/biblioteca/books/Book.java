package com.twu.biblioteca.books;

public class Book {

    String bookName;
    String author;
    String yearPublished;
    String bookID;

    public Book(String bookID, String bookName, String author, String yearPublished) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublished = yearPublished;
        this.bookID = bookID;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }



}
