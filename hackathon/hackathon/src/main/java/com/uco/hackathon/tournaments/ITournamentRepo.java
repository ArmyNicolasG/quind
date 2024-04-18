package com.uco.hackathon.tournaments;

import org.springframework.data.repository.CrudRepository;

public interface ITournamentRepo extends CrudRepository<TournamentModel, Long> {

    TournamentModel findByName(String name);

    void deleteByName(String name);
}
