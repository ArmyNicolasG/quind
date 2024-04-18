package com.uco.hackathon.controllers;

import com.uco.hackathon.tournaments.TournamentModel;
import com.uco.hackathon.tournaments.TournamentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TournamentsController {

    @Autowired
    TournamentServices tournamentServices;

    @GetMapping(value = "/tournaments") // Fetch all tournaments.
    public List<TournamentModel> getAll() {
        return tournamentServices.getAll();
    }

    @PostMapping(value = "/tournaments/new")
    public TournamentModel create(@RequestBody TournamentModel newTournamentModel){
        return tournamentServices.createTournament(newTournamentModel);
    }

    @PutMapping(value = "/tournaments/update")
    public TournamentModel update(@RequestBody TournamentModel newTournamentModel, @RequestParam String tournamentName) {
        return tournamentServices.updateTournament(newTournamentModel, tournamentName);
    }

}
