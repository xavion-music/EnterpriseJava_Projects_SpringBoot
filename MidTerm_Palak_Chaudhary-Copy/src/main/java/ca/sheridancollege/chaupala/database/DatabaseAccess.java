package ca.sheridancollege.chaupala.database;

import ca.sheridancollege.chaupala.beans.Reservation;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

@Repository
public class DatabaseAccess {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    public void insertReservation(Reservation r) {
        String sql = "INSERT INTO reservation (first_name, last_name, email, book_title, genre, pickup_location) " +
                     "VALUES (:firstName, :lastName, :email, :bookTitle, :genre, :pickupLocation)";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("firstName", r.getFirstName());
        params.addValue("lastName", r.getLastName());
        params.addValue("email", r.getEmail());
        params.addValue("bookTitle", r.getBookTitle());
        params.addValue("genre", r.getGenre());
        params.addValue("pickupLocation", r.getPickupLocation());

        jdbc.update(sql, params);
    }

    public List<Reservation> getReservationList() {
        String sql = "SELECT * FROM reservation";
        return jdbc.query(sql, new BeanPropertyRowMapper<>(Reservation.class));
    }

    public void deleteReservationById(Long id) {
        String sql = "DELETE FROM reservation WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        jdbc.update(sql, params);
    }

    public List<Reservation> getReservationById(Long id) {
        String sql = "SELECT * FROM reservation WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        return jdbc.query(sql, params, new BeanPropertyRowMapper<>(Reservation.class));
    }

    public void updateReservation(Reservation r) {
        String sql = "UPDATE reservation SET first_name = :firstName, last_name = :lastName, email = :email, " +
                     "book_title = :bookTitle, genre = :genre, pickup_location = :pickupLocation WHERE id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("firstName", r.getFirstName());
        params.addValue("lastName", r.getLastName());
        params.addValue("email", r.getEmail());
        params.addValue("bookTitle", r.getBookTitle());
        params.addValue("genre", r.getGenre());
        params.addValue("pickupLocation", r.getPickupLocation());
        params.addValue("id", r.getId());

        jdbc.update(sql, params);
    }
}
