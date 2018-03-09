package com.twu.biblioteca.books;

public class Book {

    String bookName;
    String author;
    String yearPublished;

    public Book(String bookName, String author, String yearPublished) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublished = yearPublished;

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

//    @Override
//    public boolean equals(Object object) {
//
//        boolean isEqual = false;
//
//        if (object == this) {
//
//            isEqual = true;
//        }
//        if (!(object instanceof Book)) {
//            return false;
//
//        }
//
//        Book book = (Book) object;
//
//        return book.bookName.equals(name);
//    }

//    @Override
//    public boolean equals(Object o) {
//
//        if (o == this) return true;
//        if (!(o instanceof User)) {
//            return false;
//        }
//
//        User user = (User) o;
//
//        return user.name.equals(name) &&
//                user.age == age &&
//                user.passport.equals(passport);
//    }

}
