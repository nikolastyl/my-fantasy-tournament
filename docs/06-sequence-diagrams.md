# Sequence Diagrams

## Purpose

This document describes the dynamic interactions between actors, services and system components during the execution of core business processes.

---

# SD-01 Record Match Event

## Description

The Scorekeeper records a match event during an active match.

```mermaid
sequenceDiagram
    actor Scorekeeper
    participant Controller
    participant MatchService
    participant EventRepository
    participant Database

    Scorekeeper->>Controller: Record Event
    Controller->>MatchService: Validate Request
    MatchService->>EventRepository: Save Match Event
    EventRepository->>Database: Insert Event
    Database-->>EventRepository: Success
    EventRepository-->>MatchService: Event Stored
    MatchService-->>Controller: Success
    Controller-->>Scorekeeper: Event Recorded
```

---

# SD-02 Finalize Match

## Description

The Scorekeeper finalizes a match and triggers all automatic calculations.

```mermaid
sequenceDiagram
    actor Scorekeeper
    participant MatchService
    participant StatisticsService
    participant FantasyService
    participant RankingService

    Scorekeeper->>MatchService: Finalize Match
    MatchService->>StatisticsService: Generate Statistics
    StatisticsService-->>MatchService: Statistics Created

    MatchService->>FantasyService: Calculate Fantasy Points
    FantasyService-->>MatchService: Points Calculated

    MatchService->>RankingService: Update Rankings
    RankingService-->>MatchService: Rankings Updated

    MatchService-->>Scorekeeper: Match Finalized
```

---

# SD-03 Save Lineup

## Description

A Fantasy Manager creates or updates a lineup.

```mermaid
sequenceDiagram
    actor FantasyManager
    participant Controller
    participant LineupService
    participant Repository

    FantasyManager->>Controller: Save Lineup
    Controller->>LineupService: Validate Lineup
    LineupService->>Repository: Save Lineup
    Repository-->>LineupService: Saved
    LineupService-->>Controller: Success
    Controller-->>FantasyManager: Lineup Saved
```

---

# SD-04 Auto Copy Previous Lineup

## Description

The system automatically reuses the most recent valid lineup when a manager has not configured a lineup before round lock.

```mermaid
sequenceDiagram
    participant Scheduler
    participant RoundService
    participant LineupService

    Scheduler->>RoundService: Round Starts
    RoundService->>LineupService: Check Current Lineup

    alt No Lineup Exists
        LineupService->>LineupService: Copy Previous Round Lineup
        LineupService->>LineupService: Lock New Lineup
    else Lineup Exists
        LineupService->>LineupService: Lock Current Lineup
    end
```

---

# SD-05 Trade Proposal Workflow

## Description

A Fantasy Manager proposes a trade and another manager accepts or rejects it.

```mermaid
sequenceDiagram
    actor ManagerA
    actor ManagerB
    participant TradeService
    participant TransactionService

    ManagerA->>TradeService: Create Trade Proposal
    TradeService-->>ManagerB: Trade Available

    ManagerB->>TradeService: Accept Trade

    TradeService->>TransactionService: Create Transactions
    TransactionService-->>TradeService: Completed

    TradeService-->>ManagerA: Trade Accepted
    TradeService-->>ManagerB: Trade Completed
```

---

# SD-06 Pickup / Drop Workflow

## Description

A Fantasy Manager drops a player and acquires a free agent.

```mermaid
sequenceDiagram
    actor FantasyManager
    participant RosterService
    participant TransactionService

    FantasyManager->>RosterService: Drop Player
    FantasyManager->>RosterService: Pickup Player

    RosterService->>RosterService: Validate Roster Rules

    RosterService->>TransactionService: Create Transactions

    TransactionService-->>RosterService: Saved

    RosterService-->>FantasyManager: Roster Updated
```

---

# Summary

The diagrams cover the most important dynamic workflows of the platform:

- Record Match Event
- Finalize Match
- Save Lineup
- Automatic Lineup Recovery
- Trade Workflow
- Pickup and Drop Workflow

Together they describe the core interactions that drive tournament management and fantasy gameplay.

