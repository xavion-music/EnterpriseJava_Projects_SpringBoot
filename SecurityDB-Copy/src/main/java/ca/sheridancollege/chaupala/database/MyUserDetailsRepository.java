package ca.sheridancollege.chaupala.database;

import ca.sheridancollege.chaupala.beans.MyUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserDetailsRepository extends JpaRepository<MyUserDetails, Integer> {
    MyUserDetails findByUsername(String username);
}
