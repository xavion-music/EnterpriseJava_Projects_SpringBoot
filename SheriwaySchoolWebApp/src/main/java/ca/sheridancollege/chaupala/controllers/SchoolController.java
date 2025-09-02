package ca.sheridancollege.chaupala.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}