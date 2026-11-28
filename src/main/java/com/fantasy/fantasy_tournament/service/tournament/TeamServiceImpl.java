package com.fantasy.fantasy_tournament.service.tournament;

import com.fantasy.fantasy_tournament.domain.tournament.Team;
import com.fantasy.fantasy_tournament.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * Default implementation of TeamService.
 *
 * This class contains business operations related
 * to tournament teams.
 *
 * Controllers should always use this service
 * instead of accessing repositories directly.
 */
@Service
@RequiredArgsConstructor
public class TeamServiceImpl
        implements TeamService {

    /*
     * Constructor Injection.
     *
     * Spring automatically injects the repository
     * through Lombok's generated constructor.
     */
    private final TeamRepository teamRepository;

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Optional<Team> findById(Long id) {
        return teamRepository.findById(id);
    }

    @Override
    public Team save(Team team) {

        /*
         * Future validation logic
         * can be added here.
         */

        return teamRepository.save(team);
    }
}