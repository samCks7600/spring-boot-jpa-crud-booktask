package com.book.crud.example.repository;

import com.book.crud.example.entity.BookInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookInformationRepository extends JpaRepository<BookInformation,Integer> {
    List<BookInformation> findByAuthor(String author);
}
