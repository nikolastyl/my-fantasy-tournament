package com.fantasy.fantasy_tournament.service.tournament;

import com.fantasy.fantasy_tournament.domain.tournament.Match;

import java.util.List;
import java.util.Optional;

public interface MatchService {

    List<Match> findAll();

    Optional<Match> findById(Long id);

    Match save(Match match);

}
