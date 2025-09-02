package ca.sheridancollege.chaupala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/confidential")
    public String confidential() {
        return "confidential";
    }
}
