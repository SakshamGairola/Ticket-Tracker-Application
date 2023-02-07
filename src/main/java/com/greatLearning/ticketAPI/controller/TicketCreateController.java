package com.greatLearning.ticketAPI.controller;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ticket")
public class TicketCreateController {

    @Autowired
    TicketCreateService createService;

    @GetMapping("/new")
    public ModelAndView showAddNewTicket(Model model) {
        ModelAndView modelAndView = new ModelAndView("addNewTicket");
        Ticket ticket = new Ticket();
        modelAndView.addObject("ticket", ticket);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveNewTicket(@ModelAttribute("newTicket") Ticket ticket) {
        ModelAndView modelAndView = new ModelAndView("viewTicket");
        modelAndView.addObject("ticket", ticket);
        createService.saveTicket(createService.setDate(ticket)); //sets creation data and saves the ticket
        return modelAndView;
    }
}
