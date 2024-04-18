package com.uco.hackathon.teams;

import com.uco.hackathon.tournaments.TournamentModel;
import org.springframework.data.repository.CrudRepository;

public interface ITeamRepo extends CrudRepository<TeamModel, Long> {
}
