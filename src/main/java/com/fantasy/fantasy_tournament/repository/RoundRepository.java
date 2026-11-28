package com.fantasy.fantasy_tournament.repository;

import com.fantasy.fantasy_tournament.domain.tournament.Round;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundRepository
        extends JpaRepository<Round, Long> {
}