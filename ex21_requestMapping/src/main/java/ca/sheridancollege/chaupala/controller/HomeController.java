package ca.sheridancollege.chaupala.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.chaupala.beans.Appointment;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/formPost")
	public String formPost( Model model,
			@RequestParam("firstName") String firstName,
			@RequestParam("email") String email,
			@DateTimeFormat(iso=DateTimeFormat.ISO.DATE) @RequestParam("appointmentDate") LocalDate appointmentDate,
			@DateTimeFormat(iso=DateTimeFormat.ISO.TIME) @RequestParam("appointmentTime") LocalTime appointmentTime
			)
	
	{
		
		Appointment appointment = new Appointment();
		appointment.setFirstName(firstName);
		appointment.setEmail(email);
		appointment.setAppointmentDate(appointmentDate);
		appointment.setAppointmentTime(appointmentTime);
		
		System.out.println(appointment);
		
		return "working";
		
	}
}
