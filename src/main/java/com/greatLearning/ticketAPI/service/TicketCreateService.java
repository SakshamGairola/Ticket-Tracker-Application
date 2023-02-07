package com.greatLearning.ticketAPI.service;

import com.greatLearning.ticketAPI.model.Ticket;

public interface TicketCreateService {
    void saveTicket(Ticket ticket);

    Ticket setDate(Ticket ticket);
}
