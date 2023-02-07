package com.greatLearning.ticketAPI.controller;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketDeleteService;
import com.greatLearning.ticketAPI.service.TicketReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ticket")
public class TicketDeleteController {

    @Autowired
    TicketDeleteService deleteService;

    @Autowired
    TicketReadService readService;

    @GetMapping("/delete/{id}")
    public ModelAndView deleteTicket(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("invalidView");
        Ticket ticket = readService.getTicket(id);
        if (ticket != null) {
            modelAndView.setViewName("deleteTicket");
            modelAndView.addObject("deleteTicket", ticket);
            this.deleteService.deleteTicket(ticket);
        }
        return modelAndView;
    }
}
