package com.uco.hackathon.tournaments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TournamentServices {

    @Autowired
    ITournamentRepo tournamentRepo;

    public List<TournamentModel> getAll() {
        return (List<TournamentModel>) tournamentRepo.findAll();
    }

    public TournamentModel createTournament (TournamentModel newTournamentModel) {

        if (Objects.nonNull(tournamentRepo.findByName(newTournamentModel.getName()))) {
            return null;
        } else {
            if( !Objects.nonNull(newTournamentModel.getName())
             || !Objects.nonNull(newTournamentModel.getDescription())
             || !Objects.nonNull(newTournamentModel.getSport())
             || !Objects.nonNull(newTournamentModel.getLocation()))
            {
                return null;
            }

            return tournamentRepo.save(newTournamentModel);
        }

    }

    public TournamentModel updateTournament (TournamentModel newTournamentModel, String name) {

        if (!Objects.nonNull(tournamentRepo.findByName(newTournamentModel.getName()))) {
            return null;
        } else {
            if( !Objects.nonNull(newTournamentModel.getName())
                    || !Objects.nonNull(newTournamentModel.getDescription())
                    || !Objects.nonNull(newTournamentModel.getSport())
                    || !Objects.nonNull(newTournamentModel.getLocation()))
            {
                return null;
            }

            tournamentRepo.deleteByName(name);
            return tournamentRepo.save(newTournamentModel);

        }

    }

}
