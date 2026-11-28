package com.fantasy.fantasy_tournament.domain.tournament;

import com.fantasy.fantasy_tournament.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "matches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * Matchday that contains this match.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "round_id",
            nullable = false
    )
    private Round round;

    /*
     * Home team.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "home_team_id",
            nullable = false
    )
    private Team homeTeam;

    /*
     * Away team.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "away_team_id",
            nullable = false
    )
    private Team awayTeam;

    /*
     * Final home score.
     */
    @Column(name = "home_score")
    private Integer homeScore;

    /*
     * Final away score.
     */
    @Column(name = "away_score")
    private Integer awayScore;

    /*
     * Match lifecycle state.
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MatchStatus status;

    /*
     * Indicates whether the match
     * has been finalized.
     */
    @Column(nullable = false)
    private Boolean finalized;
}