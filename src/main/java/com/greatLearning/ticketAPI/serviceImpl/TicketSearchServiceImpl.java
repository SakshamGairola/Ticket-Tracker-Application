package com.greatLearning.ticketAPI.serviceImpl;

import com.greatLearning.ticketAPI.model.Ticket;
import com.greatLearning.ticketAPI.repository.TicketRepository;
import com.greatLearning.ticketAPI.service.TicketSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketSearchServiceImpl implements TicketSearchService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> searchTickets(String keyword) {
        Ticket ticket = Ticket.builder().title(keyword).shortDesc(keyword).build();

        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAny().withMatcher("title",
                ExampleMatcher.GenericPropertyMatchers
                        .contains().ignoreCase()).withMatcher("shortDesc",
                ExampleMatcher.GenericPropertyMatchers
                        .contains().ignoreCase()).withIgnorePaths("ticketID", "content", "createdOn");
        Example<Ticket> example = Example.of(ticket, exampleMatcher);
        return ticketRepository.findAll(example);
    }
}
