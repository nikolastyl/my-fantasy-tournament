package com.fantasy.fantasy_tournament.domain.tournament;

import com.fantasy.fantasy_tournament.domain.season.Season;
import com.fantasy.fantasy_tournament.domain.shared.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * Player first name.
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /*
     * Player last name.
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /*
     * Player age during this season.
     */
    @Column(nullable = false)
    private Integer age;

    /*
     * Profile photo path or URL.
     */
    @Column
    private String photo;

    /*
     * Player belongs to exactly one season.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "season_id",
            nullable = false
    )
    private Season season;

    /*
     * Player belongs to exactly one team.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "team_id",
            nullable = false
    )
    private Team team;
}