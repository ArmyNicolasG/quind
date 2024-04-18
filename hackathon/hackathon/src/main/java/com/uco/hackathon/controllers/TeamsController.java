package com.uco.hackathon.controllers;

import com.uco.hackathon.teams.TeamModel;
import com.uco.hackathon.teams.TeamServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TeamsController {

    @Autowired
    TeamServices teamServices;

    @GetMapping(value = "/teams") // Fetch all teams.
    public List<TeamModel> getAll() {
        return teamServices.getAll();
    }

    @PostMapping(value = "/teams/new") // Create new team.
    public TeamModel create(@RequestBody TeamModel newTeamModel, @RequestParam String tournamentName) {
        return teamServices.createTeam(newTeamModel, tournamentName);
    }

}
