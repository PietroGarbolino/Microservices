package org.example.borrowig.repos;


import org.example.borrowig.models.Borrowing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingRepos extends CrudRepository<Borrowing,String> {
}

