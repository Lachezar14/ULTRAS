package com.ultras.footbalticketsapp.mapper;

import com.ultras.footbalticketsapp.controller.footballTeam.FootballTeamResponse;
import com.ultras.footbalticketsapp.controller.footballTeam.NewFootballTeamRequest;
import com.ultras.footbalticketsapp.model.FootballTeam;
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
public class FootballTeamMapperImpl implements FootballTeamMapper {

    @Override
    public FootballTeam newFootballTeamRequestToFootballTeam(NewFootballTeamRequest team) {
        if ( team == null ) {
            return null;
        }

        FootballTeam footballTeam = new FootballTeam();

        footballTeam.setName( team.getName() );
        footballTeam.setStadium( team.getStadium() );

        return footballTeam;
    }

    @Override
    public FootballTeam footballTeamResponseToFootballTeam(FootballTeamResponse team) {
        if ( team == null ) {
            return null;
        }

        FootballTeam footballTeam = new FootballTeam();

        footballTeam.setId( team.getId() );
        footballTeam.setName( team.getName() );
        footballTeam.setStadium( team.getStadium() );

        return footballTeam;
    }

    @Override
    public FootballTeamResponse footballTeamToFootballTeamResponse(FootballTeam team) {
        if ( team == null ) {
            return null;
        }

        FootballTeamResponse footballTeamResponse = new FootballTeamResponse();

        footballTeamResponse.setId( team.getId() );
        footballTeamResponse.setName( team.getName() );
        footballTeamResponse.setStadium( team.getStadium() );

        return footballTeamResponse;
    }

    @Override
    public List<FootballTeamResponse> footballTeamsToFootballTeamsResponse(List<FootballTeam> teams) {
        if ( teams == null ) {
            return null;
        }

        List<FootballTeamResponse> list = new ArrayList<FootballTeamResponse>( teams.size() );
        for ( FootballTeam footballTeam : teams ) {
            list.add( footballTeamToFootballTeamResponse( footballTeam ) );
        }

        return list;
    }
}
