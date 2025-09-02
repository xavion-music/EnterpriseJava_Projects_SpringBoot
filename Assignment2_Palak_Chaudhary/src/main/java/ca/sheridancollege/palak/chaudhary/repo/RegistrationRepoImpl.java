package ca.sheridancollege.palak.chaudhary.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.palak.chaudhary.model.Registration;

@Repository
public class RegistrationRepoImpl implements RegistrationRepo {

	@Autowired
	private JdbcTemplate jdbc;

	private Registration mapRow(ResultSet rs, int rowNum) throws SQLException {
		Registration reg = new Registration();
		reg.setId(rs.getLong("id"));
		reg.setFirstName(rs.getString("firstName"));
		reg.setLastName(rs.getString("lastName"));
		reg.setGender(rs.getString("gender"));
		reg.setEmail(rs.getString("email"));
		reg.setSchoolName(rs.getString("schoolName"));
		reg.setCourse(rs.getString("course"));
		return reg;
	}

	@Override
	public void addRegistration(Registration reg) {
		String sql = "INSERT INTO REG (firstName, lastName, gender, email, schoolName, course) VALUES (?, ?, ?, ?, ?, ?)";
		jdbc.update(sql, reg.getFirstName(), reg.getLastName(), reg.getGender(),
				reg.getEmail(), reg.getSchoolName(), reg.getCourse());
	}

	@Override
	public List<Registration> getAllRegistrations() {
		return jdbc.query("SELECT * FROM REG", this::mapRow);
	}

	@Override
	public Registration getRegistrationById(Long id) {
		return jdbc.queryForObject("SELECT * FROM REG WHERE id = ?", this::mapRow, id);
	}

	@Override
	public void updateRegistration(Registration reg) {
		String sql = "UPDATE REG SET firstName = ?, lastName = ?, gender = ?, email = ?, schoolName = ?, course = ? WHERE id = ?";
		jdbc.update(sql, reg.getFirstName(), reg.getLastName(), reg.getGender(),
				reg.getEmail(), reg.getSchoolName(), reg.getCourse(), reg.getId());
	}

	@Override
	public void deleteRegistration(Long id) {
		jdbc.update("DELETE FROM REG WHERE id = ?", id);
	}
}
