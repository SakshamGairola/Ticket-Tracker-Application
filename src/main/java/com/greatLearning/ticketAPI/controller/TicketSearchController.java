package com.greatLearning.ticketAPI.controller;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketSearchController {

    @Autowired
    TicketSearchService searchService;

    @GetMapping("/search")
    @ResponseBody
    public ModelAndView searchKeyword(String keyword) {
        ModelAndView modelAndView = new ModelAndView("homeView");
        List<Ticket> ticketList = searchService.searchTickets(keyword);
        modelAndView.addObject("allTickets", ticketList);
        return modelAndView;
    }
}
