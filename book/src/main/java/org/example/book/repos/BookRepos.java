package org.example.book.repos;

import org.example.book.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepos extends MongoRepository<Book,String> {
}
