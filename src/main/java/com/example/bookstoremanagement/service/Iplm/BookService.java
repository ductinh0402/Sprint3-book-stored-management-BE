package com.example.bookstoremanagement.service.Iplm;

import com.example.bookstoremanagement.model.Book;
import com.example.bookstoremanagement.repository.IBookRepository;
import com.example.bookstoremanagement.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;


    @Override
    public Page<Book> findAll(String category, String name, Pageable pageable) {
        return iBookRepository.findAllByCategory_IdAndNameContaining(category,name,pageable);
    }

    @Override
    public Page<Book> findAllBook(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }


}
