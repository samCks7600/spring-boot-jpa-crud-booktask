package com.book.crud.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "bookinformation")
public class BookInformation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author")
    private String author;

    @Column(name = "publish_date")
    private String publishDate;

    @Column(name = "price")
    private String price;

    @Column(name = "isbn")
    private String ISBN;


    public BookInformation(int bookId, String bookName, String author, String publishDate, String price, String ISBN) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
        this.ISBN = ISBN;
    }

    public BookInformation(){}

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
