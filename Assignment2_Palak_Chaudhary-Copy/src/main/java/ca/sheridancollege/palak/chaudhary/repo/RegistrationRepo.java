package ca.sheridancollege.palak.chaudhary.repo;

import java.util.List;
import ca.sheridancollege.palak.chaudhary.model.Registration;

public interface RegistrationRepo {
	void addRegistration(Registration reg);
	List<Registration> getAllRegistrations();
	Registration getRegistrationById(Long id);
	void updateRegistration(Registration reg);
	void deleteRegistration(Long id);
}
