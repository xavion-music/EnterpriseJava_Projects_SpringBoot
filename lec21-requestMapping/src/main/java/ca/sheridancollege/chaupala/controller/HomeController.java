package ca.sheridancollege.chaupala.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.chaupala.beans.Student;

@Controller
public class HomeController {

	@GetMapping("/") //http://localhost:8080
	public String index(Model model)
	{
		return "index";
	}
	
	@PostMapping("/formPost")
	public String formPost(Model model, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("studentNumber") Long studentNumber,
			@DateTimeFormat(iso=DateTimeFormat.ISO.DATE) @RequestParam("birthday") LocalDate birthday)
	
	{
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setBirthday(birthday);
		student.setStudentNumber(studentNumber);
		System.out.println(student);
		return "working";
	}
  
 }
