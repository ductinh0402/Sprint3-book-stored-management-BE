package com.example.bookstoremanagement.repository;

import com.example.bookstoremanagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository  extends JpaRepository<Book,Long> {
}
