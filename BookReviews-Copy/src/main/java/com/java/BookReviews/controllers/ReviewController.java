package com.java.BookReviews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.BookReviews.beans.Review;
import com.java.BookReviews.services.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;

	@RequestMapping("/newReview/{bookId}")
	public String showAddReviewForm(@PathVariable int bookId, Model model) {
		Review review = new Review();
		review.setBookId(bookId);
		model.addAttribute("newReview", review);
		return "reviewform";
	}

	@PostMapping("/saveReview")
	public String saveReview(@ModelAttribute("newReview") Review newReview) {
		reviewService.saveReview(newReview);
		return "redirect:/";
	}

	@RequestMapping("/deleteReview/{id}")
	public String deleteReview(@PathVariable int id) {
		reviewService.deleteReview(id);
		return "redirect:/";
	}

}