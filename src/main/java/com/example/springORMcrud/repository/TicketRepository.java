package com.example.springORMcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springORMcrud.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer>
{

}
