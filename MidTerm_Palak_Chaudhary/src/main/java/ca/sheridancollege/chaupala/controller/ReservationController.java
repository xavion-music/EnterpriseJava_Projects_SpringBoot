package ca.sheridancollege.chaupala.controller;

import ca.sheridancollege.chaupala.beans.Reservation;
import ca.sheridancollege.chaupala.database.DatabaseAccess;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationController {

    @Autowired
    private DatabaseAccess da;

    @GetMapping("/")
    public String home(HttpSession session) {
        if (session.isNew()) {
            session.setAttribute("greeting", "Welcome, new user!");
        } else {
            session.setAttribute("greeting", "Welcome back!");
        }
        return "index";
    }

    @GetMapping("/reserve")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reserve";
    }

    @PostMapping("/submitReservation")
    public String submitForm(@ModelAttribute Reservation reservation, Model model) {
        da.insertReservation(reservation);
        model.addAttribute("reservation", reservation);
        return "successful";
    }

    @GetMapping("/viewReservations")
    public String viewAll(Model model) {
        model.addAttribute("reservationList", da.getReservationList());
        return "view";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Reservation r = da.getReservationById(id).get(0);
        model.addAttribute("reservation", r);
        return "edit";
    }

    @PostMapping("/updateReservation")
    public String update(@ModelAttribute Reservation reservation) {
        da.updateReservation(reservation);
        return "redirect:/viewReservations";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        da.deleteReservationById(id);
        return "redirect:/viewReservations";
    }
}
