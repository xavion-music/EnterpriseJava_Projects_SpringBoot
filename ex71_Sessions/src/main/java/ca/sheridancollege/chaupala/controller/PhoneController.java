package ca.sheridancollege.chaupala.controller;

import ca.sheridancollege.chaupala.beans.Phone;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class PhoneController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("phone", new Phone());
        return "index";
    }

    @SuppressWarnings("unchecked")
    @PostMapping("/insertPhone")
    public String insertPhone(HttpSession session, Model model, @ModelAttribute Phone phone) {

        List<Phone> phoneList;

        if (session.isNew() || session.getAttribute("phoneList") == null) {
            phoneList = new CopyOnWriteArrayList<>();
        } else {
            phoneList = (CopyOnWriteArrayList<Phone>) session.getAttribute("phoneList");
        }

        phoneList.add(phone);
        session.setAttribute("phoneList", phoneList);

        model.addAttribute("phone", new Phone());
        return "index";
    }
}
