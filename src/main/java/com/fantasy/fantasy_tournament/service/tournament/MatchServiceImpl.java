package com.fantasy.fantasy_tournament.service.tournament;

import com.fantasy.fantasy_tournament.domain.tournament.Match;
import com.fantasy.fantasy_tournament.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Match business operations.
 *
 * Future responsibilities:
 * - Validate scheduling rules
 * - Validate team participation
 * - Match finalization rules
 * - Statistics generation triggers
 */
@Service
@RequiredArgsConstructor
public class MatchServiceImpl
        implements MatchService {

    private final MatchRepository matchRepository;

    @Override
    public List<Match> findAll() {
        return matchRepository.findAll();
    }

    @Override
    public Optional<Match> findById(Long id) {
        return matchRepository.findById(id);
    }

    @Override
    public Match save(Match match) {

        /*
         * Future validation logic
         * will be implemented here.
         */

        return matchRepository.save(match);
    }
}