package ca.sheridancollege.palak.chaudhary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ca.sheridancollege.palak.chaudhary.model.Registration;
import ca.sheridancollege.palak.chaudhary.repo.RegistrationRepo;

@Controller
public class RegCtrl {

	@Autowired
	private RegistrationRepo repo;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/register")
	public String showForm(Model model) {
		model.addAttribute("registration", new Registration());
		return "register";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute Registration registration, Model model) {
		repo.addRegistration(registration);
		model.addAttribute("registration", registration);
		return "success";
	}

	@GetMapping("/view")
	public String viewRegistrations(Model model) {
		model.addAttribute("registrations", repo.getAllRegistrations());
		return "view";
	}

	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable Long id, Model model) {
		model.addAttribute("registration", repo.getRegistrationById(id));
		return "edit";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute Registration registration) {
		repo.updateRegistration(registration);
		return "redirect:/view";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		repo.deleteRegistration(id);
		return "redirect:/view";
	}
}
