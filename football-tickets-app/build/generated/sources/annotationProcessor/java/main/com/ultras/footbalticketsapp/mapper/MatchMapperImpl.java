package com.ultras.footbalticketsapp.mapper;

import com.ultras.footbalticketsapp.controller.match.MatchResponse;
import com.ultras.footbalticketsapp.controller.match.NewMatchRequest;
import com.ultras.footbalticketsapp.model.Match;
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
public class MatchMapperImpl implements MatchMapper {

    @Override
    public Match newMatchRequestToMatch(NewMatchRequest match) {
        if ( match == null ) {
            return null;
        }

        Match match1 = new Match();

        match1.setHome_team( match.getHome_team() );
        match1.setAway_team( match.getAway_team() );
        match1.setDate( match.getDate() );
        match1.setTicket_number( match.getTicket_number() );
        match1.setTicket_price( match.getTicket_price() );

        return match1;
    }

    @Override
    public Match matchResponseToMatch(MatchResponse match) {
        if ( match == null ) {
            return null;
        }

        Match match1 = new Match();

        match1.setId( match.getId() );
        match1.setHome_team( match.getHome_team() );
        match1.setAway_team( match.getAway_team() );
        match1.setDate( match.getDate() );
        match1.setTicket_number( match.getTicket_number() );
        match1.setTicket_price( match.getTicket_price() );

        return match1;
    }

    @Override
    public MatchResponse matchToMatchResponse(Match match) {
        if ( match == null ) {
            return null;
        }

        MatchResponse matchResponse = new MatchResponse();

        matchResponse.setId( match.getId() );
        matchResponse.setHome_team( match.getHome_team() );
        matchResponse.setAway_team( match.getAway_team() );
        matchResponse.setDate( match.getDate() );
        matchResponse.setTicket_number( match.getTicket_number() );
        matchResponse.setTicket_price( match.getTicket_price() );

        return matchResponse;
    }

    @Override
    public List<MatchResponse> matchesToMatchesResponse(List<Match> matches) {
        if ( matches == null ) {
            return null;
        }

        List<MatchResponse> list = new ArrayList<MatchResponse>( matches.size() );
        for ( Match match : matches ) {
            list.add( matchToMatchResponse( match ) );
        }

        return list;
    }
}
