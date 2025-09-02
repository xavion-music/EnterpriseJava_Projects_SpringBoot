package com.java.BookReviews.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.BookReviews.beans.MyUserDetails;

public interface MyUserDetailsRepository extends JpaRepository<MyUserDetails, Long> {
    MyUserDetails findByUsername(String username);
}
