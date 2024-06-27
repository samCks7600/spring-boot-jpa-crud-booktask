package com.book.crud.example.service;

import com.book.crud.example.entity.BookInformation;

import java.util.List;
import java.util.Optional;

public interface BookInformationService {

//    public ResponseFactory getAllBook();
//
//    public ResponseFactory findByID(String id);
//
//    public ResponseFactory createBookInformation(BookInformation book);
//
//    public ResponseFactory updateBookInformation(String ID, BookInformation book);
//
//    public ResponseFactory deleteByID(String isbn);

    List<BookInformation> getAllBooks();

    Optional<BookInformation> getBookById(int bookId);

    BookInformation saveBook(BookInformation book);

    void deleteBook(int bookId);

    BookInformation updateBook(int bookId, BookInformation bookDetails);

    List<BookInformation> getBooksByAuthor(String author);
}