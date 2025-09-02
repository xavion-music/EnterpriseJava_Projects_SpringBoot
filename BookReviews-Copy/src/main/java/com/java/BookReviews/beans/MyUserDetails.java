package com.java.BookReviews.beans;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "my_user_details")
public class MyUserDetails implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String roles;

    @Column(name = "account_non_expired")
    private boolean accountNonExpired;
    @Column(name = "account_non_locked")
    private boolean accountNonLocked;
    @Column(name = "credentials_non_expired")
    private boolean credentialsNonExpired;
    private boolean enabled;

    // --- Required by JPA ---
    public MyUserDetails() {}

    // --- Getters and Setters ---
    // (Generate or fill in as needed)

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // SimpleAuthority for single role
        return Collections.singleton(() -> roles);
    }

    @Override
    public String getPassword() { return password; }

    @Override
    public String getUsername() { return username; }

    @Override
    public boolean isAccountNonExpired() { return accountNonExpired; }

    @Override
    public boolean isAccountNonLocked() { return accountNonLocked; }

    @Override
    public boolean isCredentialsNonExpired() { return credentialsNonExpired; }

    @Override
    public boolean isEnabled() { return enabled; }
}
