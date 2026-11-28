package com.fantasy.fantasy_tournament.domain.tournament;

import com.fantasy.fantasy_tournament.domain.season.Season;
import com.fantasy.fantasy_tournament.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * Team display name.
     *
     * Example:
     * Eagles FC
     */
    @Column(nullable = false)
    private String name;

    /*
     * Path or URL of team logo.
     */
    @Column
    private String logo;

    /*
     * Each team belongs to exactly one season.
     *
     * Many teams
     * ↓
     * One season
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "season_id",
            nullable = false
    )
    private Season season;
}