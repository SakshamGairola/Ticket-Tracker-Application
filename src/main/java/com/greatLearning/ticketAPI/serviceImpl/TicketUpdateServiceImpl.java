package com.greatLearning.ticketAPI.serviceImpl;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.service.TicketCreateService;
import com.greatLearning.ticketAPI.service.TicketUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketUpdateServiceImpl implements TicketUpdateService {

    @Autowired
    TicketCreateService createService;


    public void updateTicket(Ticket ticket) {
        this.createService.saveTicket(ticket);
    }

}
