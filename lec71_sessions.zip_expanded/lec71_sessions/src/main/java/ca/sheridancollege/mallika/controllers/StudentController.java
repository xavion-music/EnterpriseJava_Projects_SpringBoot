package ca.sheridancollege.mallika.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.mallika.beans.Student;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	
	@GetMapping("/hello")
	public String hello(Model model, HttpSession session)
	{
		if(session.isNew())
			session.setAttribute("myGreeting", "Hello! New Session!");
		
		else
			session.setAttribute("myGreeting","Welcome back");
		
		session.setAttribute("sessionId", session.getId());
		return "hello";
	}
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("student", new Student());
		return "index";
	}
	
	@PostMapping("/insertStudent")
    public String insertStudent(Model model, HttpSession session, @ModelAttribute Student student) {
        List<Student> studentList = (List<Student>) session.getAttribute("studentList");
 
        if (studentList == null) {
            studentList = new CopyOnWriteArrayList<>();
        }
 
        studentList.add(student);
        session.setAttribute("studentList", studentList);
        model.addAttribute("student", new Student());
        return "index";
    }
	

}
