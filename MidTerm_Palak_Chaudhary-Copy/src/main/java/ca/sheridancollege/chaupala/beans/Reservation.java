package ca.sheridancollege.chaupala.beans;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String bookTitle;
    private String genre;
    private String pickupLocation;
}