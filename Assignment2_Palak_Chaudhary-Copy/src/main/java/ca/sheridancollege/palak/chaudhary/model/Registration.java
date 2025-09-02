package ca.sheridancollege.palak.chaudhary.model;

import lombok.Data;

@Data
public class Registration {
	private Long id;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String schoolName;
	private String course;
}
