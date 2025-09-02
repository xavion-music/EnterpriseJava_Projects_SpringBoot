package com.java.BookReviews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.java.BookReviews.beans.MyUserDetails;
import com.java.BookReviews.repositories.MyUserDetailsRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private MyUserDetailsRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUserDetails user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }
}
