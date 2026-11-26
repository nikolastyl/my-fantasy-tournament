# Domain Discovery

## Purpose

The purpose of this document is to identify the core business processes, actors, commands, events, policies and read models of the Fantasy Tournament Platform.

This document serves as the foundation for the Domain Model, ERD, Use Cases and Class Diagram.

---

# System Overview

Fantasy Tournament Platform is a private fantasy sports ecosystem designed for an annual amateur football tournament.

The platform combines:

- Tournament Management
- Match Statistics Tracking
- Fantasy League Management

Fantasy points are generated from real match events and player performances recorded during the tournament.

---

# Actors

## Administrator

Responsible for setting up and managing the tournament environment.

### Responsibilities

- Create Season
- Manage Teams
- Manage Players
- Create Managers
- Create Rounds
- Create Matches
- Manage Configuration
- Correct Match Events
- Correct Statistics

## Fantasy Manager

Responsible for managing a fantasy team.

### Responsibilities

- Manage Fantasy Team
- Create Lineups
- Select Captain
- Propose Trades
- Accept Trades
- Pickup Free Agents
- Drop Players
- View Rankings

## Scorekeeper

Responsible for collecting and validating match data.

### Responsibilities

- Record Match Events
- Enter Final Score
- Finalize Match

---

# Commands

## Season Management

- Create Season
- Update Season
- Close Season

## Team Management

- Create Team
- Update Team
- Delete Team

## Player Management

- Create Player
- Update Player
- Upload Player Photo

## Manager Management

- Create Manager
- Reset Manager Password

## Tournament Management

- Create Round
- Create Match
- Update Match

## Match Operations

- Record Goal
- Record Assist
- Record Save
- Record Yellow Card
- Record Red Card
- Record Own Goal
- Enter Final Score
- Finalize Match

## Fantasy Operations

- Create Fantasy Team
- Save Lineup
- Select Captain
- Propose Trade
- Accept Trade
- Reject Trade
- Pickup Player
- Drop Player

---

# Domain Events

## Season Events

- Season Created
- Season Updated
- Season Closed

## Team Events

- Team Created
- Team Updated

## Player Events

- Player Created
- Player Updated
- Player Photo Uploaded

## Match Events

- Goal Recorded
- Assist Recorded
- Save Recorded
- Yellow Card Recorded
- Red Card Recorded
- Own Goal Recorded
- Final Score Entered
- Match Finalized

## Fantasy Events

- Fantasy Team Created
- Lineup Saved
- Captain Selected
- Trade Proposed
- Trade Accepted
- Trade Rejected
- Player Dropped
- Player Picked Up

---

# Policies

## Match Finalization Policy

WHEN Match Finalized

THEN

- Generate Player Statistics
- Calculate Fantasy Points
- Update Fantasy Rankings
- Lock Match Events

## Round Lock Policy

WHEN Round Starts

THEN

- Lock Lineups
- Close Transfer Window

## Trade Acceptance Policy

WHEN Trade Accepted

THEN

- Exchange Players
- Record Transaction
- Update Rosters

## Pickup Policy

WHEN Player Picked Up

THEN

- Record Transaction
- Update Fantasy Roster

---

# Read Models

## Player Profile

Displays:

- Personal Information
- Photo
- Statistics
- Fantasy Points

## Fantasy Team Page

Displays:

- Team Information
- Roster
- Current Lineup
- Captain

## Match Page

Displays:

- Teams
- Score
- Events
- Statistics

## Standings Page

Displays:

- Total Fantasy Points
- Round Fantasy Points
- Ranking Position

## Player Market

Displays:

- Available Players
- Statistics
- Fantasy Points

## Transaction History

Displays:

- Trades
- Pickups
- Drops
- Draft Assignments

---

# Boundaries

## Tournament Domain

- Season
- Round
- Match
- Team
- Player
- Match Events

## Fantasy Domain

- Fantasy Team
- Lineup
- Captain
- Trades
- Rankings

## Administration Domain

- User Management
- Configuration
- Corrections
- Monitoring

---

# Summary

The Fantasy Tournament Platform consists of three primary actors (Administrator, Fantasy Manager and Scorekeeper), supports tournament management and fantasy competition workflows, and uses real match events to generate fantasy points and rankings.
