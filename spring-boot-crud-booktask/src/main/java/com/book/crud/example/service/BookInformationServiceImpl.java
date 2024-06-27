package com.book.crud.example.service;

import com.book.crud.example.repository.BookInformationRepository;
import com.book.crud.example.entity.BookInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookInformationServiceImpl implements BookInformationService {

    @Autowired
    private BookInformationRepository repository;

    @Override
    public List<BookInformation> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Optional<BookInformation> getBookById(int bookId) {
        return repository.findById(bookId);
    }

    @Override
    public BookInformation saveBook(BookInformation book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(int bookId) {
        repository.deleteById(bookId);
    }

    public List<BookInformation> getBooksByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public BookInformation updateBook(int bookId, BookInformation bookDetails) {
        Optional<BookInformation> existingBook = repository.findById(bookId);
        if (existingBook.isPresent()) {
            BookInformation updatedBook = existingBook.get();
            updatedBook.setBookName(bookDetails.getBookName());
            updatedBook.setAuthor(bookDetails.getAuthor());
            updatedBook.setPublishDate(bookDetails.getPublishDate());
            updatedBook.setPrice(bookDetails.getPrice());
            updatedBook.setISBN(bookDetails.getISBN());
            return repository.save(updatedBook);
        }
        return null;
    }
}