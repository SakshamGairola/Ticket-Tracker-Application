package com.greatLearning.ticketAPI.serviceImpl;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.repository.TicketRepository;
import com.greatLearning.ticketAPI.service.TicketReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketReadServiceImpl implements TicketReadService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return this.ticketRepository.findAll();
    }

    @Override
    public Ticket getTicket(Long id) {
        Ticket ticket = null;
        try {
            ticket = this.ticketRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println("Invalid ticket ID:" + id + ". Ticket does not exist.");
        } finally {
            return ticket;
        }
    }
}
