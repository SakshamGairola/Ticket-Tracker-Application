package com.greatLearning.ticketAPI.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long ticketID;
    @Column(name = "title")
    private String title;
    @Column(name = "shortDesc")
    private String shortDesc;
    @Column(name = "content")
    private String content;
    @Column(name = "createdOn")
    private String createdOn;
}
