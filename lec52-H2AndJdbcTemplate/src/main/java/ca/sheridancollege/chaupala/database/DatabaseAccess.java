package ca.sheridancollege.chaupala.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseAccess {

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    public void insertStudentHardCoded() {
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();

        String query = "INSERT INTO student(name) VALUES('Palak')";

        int rowsAffected = jdbc.update(query, namedParameters);
        if (rowsAffected > 0)
            System.out.println("Hard coded student inserted into database");
    }
}
