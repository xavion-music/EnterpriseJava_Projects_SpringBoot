package ca.sheridancollege.chaupala.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/addNumbers")
    @ResponseBody
    public String addNumbers(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return String.valueOf(result);
    }
}