package com.greatLearning.ticketAPI.serviceImpl;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.repository.TicketRepository;
import com.greatLearning.ticketAPI.service.TicketCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TicketCreateServiceImpl implements TicketCreateService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void saveTicket(Ticket ticket) {
        this.ticketRepository.save(ticket);
    }

    @Override
    public Ticket setDate(Ticket ticket) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime dateCreated = LocalDateTime.now();
        ticket.setCreatedOn(dateFormatter.format(dateCreated));
        return ticket;
    }
}
