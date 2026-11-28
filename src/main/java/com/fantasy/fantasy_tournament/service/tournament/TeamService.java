package com.fantasy.fantasy_tournament.service.tournament;

import com.fantasy.fantasy_tournament.domain.tournament.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    List<Team> findAll();

    Optional<Team> findById(Long id);

    Team save(Team team);
}