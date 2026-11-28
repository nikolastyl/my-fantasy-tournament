package com.fantasy.fantasy_tournament.repository;

import com.fantasy.fantasy_tournament.domain.tournament.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository
        extends JpaRepository<Team, Long> {
}