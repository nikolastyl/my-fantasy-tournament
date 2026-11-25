# Fantasy Tournament Platform

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![React](https://img.shields.io/badge/React-19-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue)
![Status](https://img.shields.io/badge/Status-Analysis%20%26%20Design-yellow)

A fantasy sports platform designed for amateur football tournaments, allowing participants to build fantasy teams based on real player performances while organizers manage tournaments, players, matches, and statistics.

---

## Table of Contents

- [Overview](#overview)
- [Business Objectives](#business-objectives)
- [Core Features](#core-features)
- [User Roles](#user-roles)
- [System Architecture](#system-architecture)
- [Project Structure](#project-structure)
- [Technology Stack](#technology-stack)
- [Documentation](#documentation)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Roadmap](#roadmap)
- [Future Features](#future-features)

---

## Overview

Fantasy Tournament Platform is a private fantasy league ecosystem specifically designed for amateur football tournaments.

The platform combines tournament management capabilities with fantasy gameplay mechanics.

---

## Business Objectives

- Digitalize amateur football tournament management
- Increase player engagement through fantasy competitions
- Provide statistics-driven tournament experiences
- Support tournament organizers with centralized administration tools
- Create a scalable platform adaptable to different sports and tournament formats

---

## Core Features

### Fantasy League

- Fantasy Draft
- Team Management
- Captain Multipliers
- Player Transfers
- Free Agent Pickups
- League Rankings
- Historical Performance Tracking

### Tournament Management

- Tournament Creation
- Team Management
- Player Registration
- Round Scheduling
- Match Management
- Statistics Recording
- Leaderboard Generation

---

## User Roles

### Administrator

- Create tournaments
- Manage teams
- Manage players
- Schedule fixtures

### Fantasy Manager

- Participate in drafts
- Create lineups
- Select captains
- Make transfers

### Scorekeeper

- Record match events
- Enter match statistics
- Finalize matches

---

## System Architecture

```text
React Frontend
       |
    REST API
       |
Spring Boot Backend
       |
PostgreSQL Database
```

---

## Project Structure

```text
my-fantasy-tournament/
├── docs/
├── backend/
├── frontend/
└── README.md
```

---

## Technology Stack

### Backend

- Java 21
- Spring Boot
- Spring Security
- JWT
- PostgreSQL
- Flyway
- Docker

### Frontend

- React
- TypeScript
- Vite

---

## Documentation

| Document | Description |
|-----------|------------|
| 01-domain-model | Business Domain Model |
| 02-erd | Database Design |
| 03-use-cases | Functional Requirements |
| 04-class-diagram | Domain Structure |
| 05-state-diagrams | Entity Lifecycles |
| 06-sequence-diagrams | Process Flows |
| 07-architecture | Technical Architecture |
| 08-decisions | Architectural Decisions |

---

## Screenshots

Coming soon...

---

## Getting Started

### Backend

```bash
./mvnw spring-boot:run
```

### Frontend

```bash
npm install
npm run dev
```

---

## Roadmap

- [x] Analysis
- [x] Design
- [ ] Backend Development
- [ ] Frontend Development
- [ ] Deployment

---

## Future Features

- Live Match Updates
- Mobile Application
- Push Notifications
- Public Leagues
- AI Player Recommendations
- Advanced Analytics Dashboard

---

## Current Status

🚧 Analysis & Design Phase
