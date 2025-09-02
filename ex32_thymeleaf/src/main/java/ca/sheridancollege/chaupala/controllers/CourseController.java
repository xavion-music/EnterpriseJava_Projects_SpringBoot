package ca.sheridancollege.chaupala.controllers;

import ca.sheridancollege.chaupala.beans.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class CourseController {

    private List<Course> courseList = new CopyOnWriteArrayList<>();

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("courseList", courseList);
        return "index";
    }

    @PostMapping("/addCourse")
    public String addCourse(@RequestParam Long id,
                            @RequestParam String prefix,
                            @RequestParam Long code,
                            @RequestParam String name,
                            Model model) {

        Course course = new Course(id, prefix, code, name);
        courseList.add(course);

        System.out.println("Updated Course List:");
        for (Course c : courseList) {
            System.out.println(c);
        }
        
        model.addAttribute("courseList", courseList);
        return "index";
    }
}
