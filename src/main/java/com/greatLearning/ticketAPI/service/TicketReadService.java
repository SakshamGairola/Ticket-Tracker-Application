package com.greatLearning.ticketAPI.service;

import com.greatLearning.ticketAPI.model.Ticket;

import java.util.List;

public interface TicketReadService {

    List<Ticket> getAllTickets();

    Ticket getTicket(Long id);
}
