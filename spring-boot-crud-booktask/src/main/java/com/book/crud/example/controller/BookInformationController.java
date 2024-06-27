package com.book.crud.example.controller;

import com.book.crud.example.entity.BookInformation;
import com.book.crud.example.service.BookInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookInformationController {

    @Autowired
    private BookInformationService service;

    @PostMapping("/create/book")
    public ResponseEntity<BookInformation> addBook(@RequestBody BookInformation book) {
        return new ResponseEntity<>(service.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping("/read/books")
    public List<BookInformation> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/read/bookById/{id}")
    public ResponseEntity<BookInformation> getBookById(@PathVariable int id) {
        Optional<BookInformation> book = service.getBookById(id);
        return book.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/read/booksByAuthor/{author}")
    public List<BookInformation> getBooksByAuthor(@PathVariable String author) {
        return service.getBooksByAuthor(author);
    }

    @PutMapping("/update/book/{id}")
    public ResponseEntity<BookInformation> updateBook(@PathVariable int id, @RequestBody BookInformation book) {
        BookInformation updatedBook = service.updateBook(id, book);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/book/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        service.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}