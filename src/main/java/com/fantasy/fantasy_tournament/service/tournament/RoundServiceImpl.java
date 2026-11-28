package com.fantasy.fantasy_tournament.service.tournament;

import com.fantasy.fantasy_tournament.domain.tournament.Round;
import com.fantasy.fantasy_tournament.repository.RoundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Default implementation of RoundService.
 *
 * All round-related business rules should be
 * implemented in this service layer.
 */
@Service
@RequiredArgsConstructor
public class RoundServiceImpl
        implements RoundService {

    /*
     * Repository used to persist and retrieve
     * round information.
     */
    private final RoundRepository roundRepository;

    @Override
    public List<Round> findAll() {
        return roundRepository.findAll();
    }

    @Override
    public Optional<Round> findById(Long id) {
        return roundRepository.findById(id);
    }

    @Override
    public Round save(Round round) {

        /*
         * Future validations:
         *
         * - only one OPEN round
         * - round dates validation
         * - season consistency checks
         */

        return roundRepository.save(round);
    }
}