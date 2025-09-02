package ca.sheridancollege.chaupala.controllers;

import ca.sheridancollege.chaupala.beans.Course;
import ca.sheridancollege.chaupala.repositories.CourseList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {

    private CourseList courseList;

    public CourseController(CourseList courseList) {
        this.courseList = courseList;
    }

    @GetMapping("/")
    public String index(Model model) {
        System.out.println("Clearing List");
        courseList.emptyList();
        return "index";
    }

    @PostMapping("/processForm")
    public String processForm(@RequestParam("id") Long id,
                              @RequestParam("prefix") String prefix,
                              @RequestParam("code") int code,
                              @RequestParam("name") String name) {

        Course c = new Course(id, prefix, code, name);
        courseList.getCourseList().add(c);

        System.out.println("***");
        for (Course x : courseList.getCourseList()) {
            System.out.println(x.toString());
        }

        return "redirect:/";
    }
}
