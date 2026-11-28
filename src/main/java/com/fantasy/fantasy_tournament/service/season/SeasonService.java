package com.fantasy.fantasy_tournament.service.season;

import com.fantasy.fantasy_tournament.domain.season.Season;

import java.util.List;
import java.util.Optional;

public interface SeasonService {

    List<Season> findAll();

    Optional<Season> findById(Long id);

    Optional<Season> findByYear(Integer year);

    Season save(Season season);

    boolean existsByYear(Integer year);

}