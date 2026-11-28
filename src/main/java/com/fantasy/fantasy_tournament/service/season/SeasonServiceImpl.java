package com.fantasy.fantasy_tournament.service.season;

import com.fantasy.fantasy_tournament.domain.season.Season;
import com.fantasy.fantasy_tournament.repository.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Season business operations.
 */
@Service
@RequiredArgsConstructor
public class SeasonServiceImpl
        implements SeasonService {

    private final SeasonRepository seasonRepository;

    @Override
    public List<Season> findAll() {
        return seasonRepository.findAll();
    }

    @Override
    public Optional<Season> findById(Long id) {
        return seasonRepository.findById(id);
    }

    @Override
    public Optional<Season> findByYear(Integer year) {
        return seasonRepository.findByYear(year);
    }

    @Override
    public Season save(Season season) {
        return seasonRepository.save(season);
    }

    @Override
    public boolean existsByYear(Integer year) {
        return seasonRepository.existsByYear(year);
    }
}