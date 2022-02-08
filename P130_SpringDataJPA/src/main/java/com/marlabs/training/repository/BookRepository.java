package com.marlabs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlabs.training.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
