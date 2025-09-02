package com.java.BookReviews.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.java.BookReviews.beans.Book;
import com.java.BookReviews.beans.Review;
import com.java.BookReviews.services.BookService;
import com.java.BookReviews.services.ReviewService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private ReviewService reviewService;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "booklist";
	}

	@RequestMapping("/newBook")
	public String showAddBookForm(Model model) {
		model.addAttribute("book", new Book());
		return "bookform";
	}

	@PostMapping("/addBook")
	public String addBook(@ModelAttribute Book book) {
		bookService.saveBook(book);
		return "redirect:/";
	}

	@RequestMapping("/editBook/{id}")
	public String showEditBookForm(@PathVariable int id, Model model) {
		model.addAttribute("book", bookService.getBookById(id));
		return "bookform";
	}

	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "redirect:/";
	}

	// ============================
	// NEW ASYNC ENDPOINTS
	// ============================  //good
	@GetMapping("/api/book/{id}")
	@ResponseBody
	public Book getBookDetails(@PathVariable int id) {
		return bookService.getBookById(id);
	}

	@GetMapping("/api/book/{id}/reviews")
	@ResponseBody
	public List<Review> getBookReviews(@PathVariable int id) {
		return reviewService.getReviewsByBookId(id);
	}
}
