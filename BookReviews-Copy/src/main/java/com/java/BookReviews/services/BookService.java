package com.java.BookReviews.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.BookReviews.beans.Book;
import com.java.BookReviews.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(int id) {
		return bookRepository.findById(id).get();
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}
}