package ca.sheridancollege.chaupala.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.chaupala.beans.Course;
import ca.sheridancollege.chaupala.repositories.CourseList;

@Controller
public class CourseController {

    @Autowired
    private CourseList courseList;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/processForm")
    public String processForm(Model model,
                               @RequestParam int id,
                               @RequestParam String prefix,
                               @RequestParam int code,
                               @RequestParam String name) {

        Course course = Course.builder()
                .id(id)
                .prefix(prefix)
                .code(code)
                .name(name)
                .build();

        courseList.getCourseList().add(course);
        model.addAttribute("courseList", courseList.getCourseList());

        
        System.out.println("Course List:");
        for (Course c : courseList.getCourseList()) {
            System.out.println(c);
        }
        //System.out.println("===================");

        return "result";
    }
}
