package com.greatLearning.ticketAPI.service;

import com.greatLearning.ticketAPI.model.Ticket;

import java.util.List;

public interface TicketSearchService {

    List<Ticket> searchTickets (String keyword);
}
