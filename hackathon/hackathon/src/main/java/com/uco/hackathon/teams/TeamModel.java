package com.uco.hackathon.teams;
import com.uco.hackathon.tournaments.TournamentModel;
import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class TeamModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    private String name;

    private String description;

    private int players;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tournamentId")
    private TournamentModel tournament;

    public void setTournament(TournamentModel tournament) {
        this.tournament = tournament;
    }

}