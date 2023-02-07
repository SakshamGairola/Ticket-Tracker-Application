package com.greatLearning.ticketAPI.controller;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketReadController {

    @Autowired
    TicketReadService readService;

    @GetMapping("")
    public ModelAndView getAllTickets() {
        ModelAndView modelAndView = new ModelAndView("homeView");
        List<Ticket> allTickets = readService.getAllTickets();
        modelAndView.addObject("allTickets", allTickets);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewATicket(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("invalidView");
        Ticket ticket = readService.getTicket(id);
        if (ticket != null) {
            modelAndView.addObject("ticket", ticket);
            modelAndView.setViewName("viewTicket");
        }
        return modelAndView;
    }

}
