package com.greatLearning.ticketAPI.serviceImpl;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.repository.TicketRepository;
import com.greatLearning.ticketAPI.service.TicketDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketDeleteServiceImpl implements TicketDeleteService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void deleteTicket(Ticket ticket) {
        this.ticketRepository.delete(ticket);
    }
}
