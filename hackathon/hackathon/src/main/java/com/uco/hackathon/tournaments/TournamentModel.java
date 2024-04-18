package com.uco.hackathon.tournaments;

import jakarta.persistence.*;

@Entity
@Table (name = "tournaments")
public class TournamentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    private String name;

    private String location;

    private String sport;

    private String description;

    public String getLocation() {
        return location;
    }

    public String getSport() {
        return sport;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}
