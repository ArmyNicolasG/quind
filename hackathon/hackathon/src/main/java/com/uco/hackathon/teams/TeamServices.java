package com.uco.hackathon.teams;

import com.uco.hackathon.tournaments.ITournamentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TeamServices {

    @Autowired
    ITeamRepo teamRepo;
    @Autowired
    ITournamentRepo tournamentRepo;

    public List<TeamModel> getAll() {
        return (List<TeamModel>) teamRepo.findAll();
    }

    public TeamModel createTeam(TeamModel newTeamModel, String tournamentName) {

        if ( Objects.nonNull(tournamentRepo.findByName(tournamentName)) ) {
            newTeamModel.setTournament(tournamentRepo.findByName(tournamentName));
            return teamRepo.save(newTeamModel);
        }

        else { return null; }

    }

}
