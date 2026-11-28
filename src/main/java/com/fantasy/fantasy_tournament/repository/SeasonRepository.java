package com.fantasy.fantasy_tournament.repository;

import com.fantasy.fantasy_tournament.domain.season.Season;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeasonRepository
        extends JpaRepository<Season, Long> {

    Optional<Season> findByYear(Integer year);

    boolean existsByYear(Integer year);

}