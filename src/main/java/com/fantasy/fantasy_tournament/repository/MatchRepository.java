package com.fantasy.fantasy_tournament.repository;

import com.fantasy.fantasy_tournament.domain.tournament.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository
        extends JpaRepository<Match, Long> {
}