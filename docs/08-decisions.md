# Architectural Decision Records (ADR)

## Purpose

This document records the most important architectural decisions made during the analysis and design of the Fantasy Tournament Platform.

Each decision includes its context, chosen solution and rationale.

---

# ADR-001

## Title

Use Java and Spring Boot for Backend Development

## Status

Accepted

## Decision

The backend will be implemented using Java 21 and Spring Boot.

## Rationale

- Strong ecosystem
- Enterprise-grade architecture
- Excellent support for security
- Strong PostgreSQL integration
- Suitable for portfolio projects

---

# ADR-002

## Title

Use PostgreSQL as Primary Database

## Status

Accepted

## Decision

PostgreSQL will be the primary relational database.

## Rationale

- Open source
- Reliable
- Excellent Spring Boot support
- Strong data integrity capabilities
- Suitable for future growth

---

# ADR-003

## Title

Use Season-Centric Architecture

## Status

Accepted

## Decision

Every tournament edition is represented as a distinct Season.

## Rationale

- Supports yearly tournaments
- Simplifies historical tracking
- Supports Hall of Fame functionality
- Simplifies reset between tournament editions

---

# ADR-004

## Title

Use Single User Entity with Roles

## Status

Accepted

## Decision

The system will use one User entity with role-based authorization.

## Roles

- ADMIN
- MANAGER
- SCOREKEEPER

## Rationale

- Avoids duplicated data
- Simplifies authentication
- Integrates naturally with Spring Security

---

# ADR-005

## Title

Use Match Events as Source of Truth

## Status

Accepted

## Decision

The Scorekeeper records match events instead of directly entering statistics.

## Rationale

- Supports live event recording
- Preserves audit history
- Enables automatic statistics generation
- Enables fantasy point calculation

---

# ADR-006

## Title

Generate Player Statistics During Match Finalization

## Status

Accepted

## Decision

Player statistics will be generated automatically during Finalize Match.

## Rationale

- Prevents manual calculation
- Keeps statistics consistent
- Simplifies scorekeeper workflow

---

# ADR-007

## Title

Store Fantasy Points in Player Statistics

## Status

Accepted

## Decision

Fantasy points will be persisted rather than calculated on every request.

## Rationale

- Faster queries
- Better player profile performance
- Faster standings generation

---

# ADR-008

## Title

Use FantasyTeamPlayer for Roster Ownership

## Status

Accepted

## Decision

FantasyTeamPlayer will represent current player ownership.

## Rationale

- Simplifies roster retrieval
- Avoids reconstruction from history
- Improves query performance

---

# ADR-009

## Title

Store Transactions Separately from Rosters

## Status

Accepted

## Decision

Transaction records will preserve historical movement.

## Rationale

- Full audit trail
- Trade history
- Pickup history
- Drop history
- Draft history

---

# ADR-010

## Title

Use Configurable Season Rules

## Status

Accepted

## Decision

Season configuration stores fantasy gameplay rules.

## Examples

- starters_count
- bench_count
- captain_multiplier
- bench_multiplier

## Rationale

- Supports rule changes
- Avoids hardcoded values
- Improves long-term flexibility

---

# ADR-011

## Title

Use JWT Authentication

## Status

Accepted

## Decision

Authentication will be implemented using JWT tokens.

## Rationale

- Stateless authentication
- Easy frontend integration
- Scalable architecture

---

# ADR-012

## Title

Use Flyway for Database Versioning

## Status

Accepted

## Decision

Database schema changes will be managed through Flyway migrations.

## Rationale

- Version-controlled schema
- Reliable deployments
- Easier collaboration

---

# ADR-013

## Title

Persist Total Fantasy Team Points

## Status

Accepted

## Decision

FantasyTeam.totalPoints will be stored and updated after match finalization.

## Rationale

- Faster leaderboard generation
- Reduced query complexity
- Better application performance

---

# Summary

The Fantasy Tournament Platform architecture prioritizes:

- Simplicity
- Maintainability
- Historical Tracking
- Clear Domain Boundaries
- Performance
- Future Extensibility

The selected architecture is suitable for both a real private fantasy league and a portfolio-quality software engineering project.

