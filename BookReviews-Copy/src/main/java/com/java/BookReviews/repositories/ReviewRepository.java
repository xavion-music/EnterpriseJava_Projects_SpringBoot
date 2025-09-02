package com.java.BookReviews.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.BookReviews.beans.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
	List<Review> findByBookId(int bookId);
}
