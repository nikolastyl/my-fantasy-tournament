package com.fantasy.fantasy_tournament.domain.tournament;

import com.fantasy.fantasy_tournament.domain.season.Season;
import com.fantasy.fantasy_tournament.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rounds")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Round extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * Sequential round number.
     *
     * Example:
     * Round 1
     * Round 2
     */
    @Column(name = "round_number", nullable = false)
    private Integer roundNumber;

    /*
     * Date and time when
     * the round begins.
     */
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    /*
     * Date and time when
     * the round ends.
     */
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    /*
     * Current lifecycle state.
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoundStatus status;

    /*
     * Each round belongs to one season.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "season_id",
            nullable = false
    )
    private Season season;
}