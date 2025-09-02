package com.java.BookReviews.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.BookReviews.beans.Review;
import com.java.BookReviews.repositories.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	public List<Review> getReviewsByBookId(int bookId) {
		return reviewRepository.findByBookId(bookId);
	}

	public void saveReview(Review review) {
		reviewRepository.save(review);
	}

	public void deleteReview(int id) {
		reviewRepository.deleteById(id);
	}
}
