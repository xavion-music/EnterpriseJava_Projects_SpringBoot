package ca.sheridancollege.chaupala.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

	  private String firstName;
	  private String email;
	  private LocalDate appointmentDate;
	  private LocalTime appointmentTime;
	  
	  
	@Override
	public String toString() {
		return "Appointment [firstName=" + firstName + ", email=" + email + ", appointmentDate=" + appointmentDate
				+ ", appointmentTime=" + appointmentTime + ", getFirstName()=" + getFirstName() + ", getEmail()="
				+ getEmail() + ", getAppointmentDate()=" + getAppointmentDate() + ", getAppointmentTime()="
				+ getAppointmentTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	
}
