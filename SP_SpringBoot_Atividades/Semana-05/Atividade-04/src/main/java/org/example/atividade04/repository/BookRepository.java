package org.example.atividade04.repository;

import org.example.atividade04.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByAuthor(String author);
    List<Book> findByPublishedYearGreaterThan(int year);
}
