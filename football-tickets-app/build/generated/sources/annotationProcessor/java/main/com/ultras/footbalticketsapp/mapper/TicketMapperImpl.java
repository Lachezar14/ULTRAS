package com.ultras.footbalticketsapp.mapper;

import com.ultras.footbalticketsapp.controller.ticket.BuyTicketRequest;
import com.ultras.footbalticketsapp.controller.ticket.TicketResponse;
import com.ultras.footbalticketsapp.model.Ticket;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-14T16:00:37+0100",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Oracle Corporation)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public Ticket buyTicketRequestToTicket(BuyTicketRequest ticket) {
        if ( ticket == null ) {
            return null;
        }

        Ticket ticket1 = new Ticket();

        ticket1.setMatch( ticket.getMatch() );
        ticket1.setBuyer( ticket.getBuyer() );
        ticket1.setPrice( ticket.getPrice() );

        return ticket1;
    }

    @Override
    public Ticket ticketResponseToTicket(TicketResponse ticket) {
        if ( ticket == null ) {
            return null;
        }

        Ticket ticket1 = new Ticket();

        ticket1.setId( ticket.getId() );
        ticket1.setMatch( ticket.getMatch() );
        ticket1.setBuyer( ticket.getBuyer() );
        ticket1.setPrice( ticket.getPrice() );

        return ticket1;
    }

    @Override
    public TicketResponse ticketToTicketResponse(Ticket ticket) {
        if ( ticket == null ) {
            return null;
        }

        TicketResponse ticketResponse = new TicketResponse();

        ticketResponse.setId( ticket.getId() );
        ticketResponse.setMatch( ticket.getMatch() );
        ticketResponse.setBuyer( ticket.getBuyer() );
        ticketResponse.setPrice( ticket.getPrice() );

        return ticketResponse;
    }

    @Override
    public List<TicketResponse> ticketsToTicketsResponse(List<Ticket> tickets) {
        if ( tickets == null ) {
            return null;
        }

        List<TicketResponse> list = new ArrayList<TicketResponse>( tickets.size() );
        for ( Ticket ticket : tickets ) {
            list.add( ticketToTicketResponse( ticket ) );
        }

        return list;
    }
}
