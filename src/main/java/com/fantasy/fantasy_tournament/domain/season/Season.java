package com.fantasy.fantasy_tournament.domain.season;

import java.math.BigDecimal;

import com.fantasy.fantasy_tournament.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "seasons",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uq_season_year",
                        columnNames = "year"
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Season extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * Display name shown throughout the application.
     *
     * Example:
     * Summer Cup 2027
     */
    @Column(nullable = false, length = 150)
    private String name;

    /*
     * Tournament year.
     *
     * We decided during analysis that each year
     * represents a unique season.
     */
    @Column(nullable = false)
    private Integer year;

    /*
     * Number of starters allowed in a lineup.
     *
     * Configurable per season.
     */
    @Column(name = "starters_count", nullable = false)
    private Integer startersCount;

    /*
     * Number of bench players allowed.
     */
    @Column(name = "bench_count", nullable = false)
    private Integer benchCount;

    /*
     * Multiplier applied to captain points.
     *
     * Current business rule = 2.0
     */
    @Column(name = "captain_multiplier", nullable = false)
    private BigDecimal captainMultiplier;

    /*
     * Multiplier applied to bench players.
     *
     * Current business rule = 0.5
     */
    @Column(name = "bench_multiplier", nullable = false)
    private BigDecimal benchMultiplier;

    /*
     * Determines whether transfers
     * are currently allowed.
     */
    @Column(name = "transfer_window_open", nullable = false)
    private Boolean transferWindowOpen;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SeasonStatus status;
}