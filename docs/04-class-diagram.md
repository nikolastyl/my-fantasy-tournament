# Class Diagram

## Purpose

This document describes the object-oriented design of the Fantasy Tournament Platform.

The class model serves as the foundation for the Java Spring Boot implementation.

---

# Core Classes

## Tournament Domain

- Season
- Team
- Player
- Round
- Match
- MatchEvent
- PlayerStatistics

## Fantasy Domain

- FantasyTeam
- FantasyTeamPlayer
- Lineup
- LineupPlayer
- Trade
- Transaction

## User Domain

- User

---

# Enumerations

## UserRole

- ADMIN
- MANAGER
- SCOREKEEPER

## MatchStatus

- SCHEDULED
- IN_PROGRESS
- FINALIZED

## RoundStatus

- OPEN
- LOCKED

## TradeStatus

- PENDING
- ACCEPTED
- REJECTED
- CANCELLED

## EventType

- GOAL
- ASSIST
- SAVE
- YELLOW_CARD
- RED_CARD
- OWN_GOAL

## LineupRole

- STARTER
- BENCH

---

# UML Class Diagram

```mermaid
classDiagram

class User {
    +Long id
    +String firstName
    +String lastName
    +String email
    +String password
    +UserRole role

    +login()
    +changePassword()
}

class Season {
    +Long id
    +String name
    +Integer year
    +Integer startersCount
    +Integer benchCount
    +Double captainMultiplier
    +Double benchMultiplier
}

class Team {
    +Long id
    +String name
    +String logo
}

class Player {
    +Long id
    +String firstName
    +String lastName
    +Integer age
    +String photo
}

class Round {
    +Long id
    +Integer roundNumber
    +RoundStatus status

    +lockRound()
}

class Match {
    +Long id
    +Integer homeScore
    +Integer awayScore
    +MatchStatus status

    +recordEvent()
    +finalizeMatch()
}

class MatchEvent {
    +Long id
    +EventType eventType
}

class PlayerStatistics {
    +Integer goals
    +Integer assists
    +Integer saves
    +Integer yellowCards
    +Integer redCards
    +Integer ownGoals
    +Integer fantasyPoints

    +calculateFantasyPoints()
}

class FantasyTeam {
    +Long id
    +String name
    +String logo
    +Integer totalPoints

    +addPlayer()
    +removePlayer()
}

class FantasyTeamPlayer {
    +Long id
    +LocalDateTime joinedAt
    +LocalDateTime leftAt
}

class Lineup {
    +Long id
    +Boolean locked

    +saveLineup()
    +lockLineup()
}

class LineupPlayer {
    +LineupRole role
    +Boolean captain
}

class Trade {
    +Long id
    +TradeStatus status

    +accept()
    +reject()
    +cancel()
}

class Transaction {
    +Long id
    +String type
}

User "1" --> "1" FantasyTeam

Season "1" --> "*" Team
Season "1" --> "*" Player
Season "1" --> "*" Round
Season "1" --> "*" FantasyTeam

Team "1" --> "*" Player

Round "1" --> "*" Match

Match "1" --> "*" MatchEvent
Match "1" --> "*" PlayerStatistics

Player "1" --> "*" MatchEvent
Player "1" --> "*" PlayerStatistics

FantasyTeam "1" --> "*" FantasyTeamPlayer
FantasyTeamPlayer "*" --> "1" Player

FantasyTeam "1" --> "*" Lineup

Lineup "1" --> "*" LineupPlayer
LineupPlayer "*" --> "1" Player

FantasyTeam "1" --> "*" Transaction

Trade --> FantasyTeam
```

---

# Class Responsibilities

## User

Responsible for authentication and authorization.

---

## Match

Responsible for managing match lifecycle and finalization.

---

## MatchEvent

Represents match actions recorded by the Scorekeeper.

---

## PlayerStatistics

Stores generated statistics and fantasy points.

---

## FantasyTeam

Represents a manager's fantasy team.

---

## Lineup

Represents round-based player selection.

---

## Trade

Represents a trade proposal workflow.

---

## Transaction

Represents historical roster movement.

---

# Business Rules Mapping

- One manager owns one fantasy team per season.
- One player belongs to one fantasy team at a time.
- Lineups lock when a round starts.
- Trades require acceptance.
- Match finalization generates statistics.
- Fantasy points are calculated from player statistics.
- Rankings are derived from fantasy team points.

