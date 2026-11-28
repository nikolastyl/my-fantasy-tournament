package com.fantasy.fantasy_tournament.config.bootstrap;

import com.fantasy.fantasy_tournament.domain.season.Season;
import com.fantasy.fantasy_tournament.domain.season.SeasonStatus;
import com.fantasy.fantasy_tournament.service.season.SeasonService;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
 * Creates the first season automatically
 * when the system starts.
 */
@Component
@RequiredArgsConstructor
public class SeasonInitializer
        implements CommandLineRunner {

    private final SeasonService seasonService;

    @Override
    public void run(String... args) {

        if (seasonService.existsByYear(2027)) {
            return;
        }

        Season season = Season.builder()
                .name("Riza League Test")
                .year(2027)
                .startersCount(6)
                .benchCount(3)
                .captainMultiplier(BigDecimal.valueOf(2.0))
                .benchMultiplier(BigDecimal.valueOf(0.5))
                .transferWindowOpen(true)
                .status(SeasonStatus.ACTIVE)
                .build();

        seasonService.save(season);

        System.out.println(
                "Default season created."
        );
    }
}