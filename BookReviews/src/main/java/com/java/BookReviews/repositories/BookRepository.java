package com.java.BookReviews.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.BookReviews.beans.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}