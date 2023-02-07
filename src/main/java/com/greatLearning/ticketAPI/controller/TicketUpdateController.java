package com.greatLearning.ticketAPI.controller;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketReadService;
import com.greatLearning.ticketAPI.service.TicketUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ticket")
public class TicketUpdateController {

    @Autowired
    TicketUpdateService updateService;

    @Autowired
    TicketReadService readService;

    @GetMapping("/edit/{id}")
    public ModelAndView getUpdateForm(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("invalidView");
        Ticket ticket = readService.getTicket(id);
        if (ticket != null) {
            modelAndView.setViewName("updateTicket");
            modelAndView.addObject("ticket", ticket);
        }
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView updateTicket(@ModelAttribute Ticket ticket) {
        ModelAndView modelAndView = new ModelAndView("viewTicket");
        modelAndView.addObject("ticket", ticket);
        updateService.updateTicket(ticket);
        return modelAndView;
    }
}
