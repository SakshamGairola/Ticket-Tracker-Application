package com.greatLearning.ticketAPI.repository;

import com.greatLearning.ticketAPI.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ticketRepository")
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
