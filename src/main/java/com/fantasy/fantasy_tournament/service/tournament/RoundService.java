package com.fantasy.fantasy_tournament.service.tournament;

import com.fantasy.fantasy_tournament.domain.tournament.Round;

import java.util.List;
import java.util.Optional;

public interface RoundService {

    List<Round> findAll();

    Optional<Round> findById(Long id);

    Round save(Round round);

}
