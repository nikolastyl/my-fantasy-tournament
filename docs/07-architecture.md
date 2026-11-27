# Architecture Document

## Purpose

This document describes the technical architecture of the Fantasy Tournament Platform.

The system follows a layered architecture with a React frontend, Spring Boot backend and PostgreSQL database.

---

# Architecture Overview

```text
+----------------------+
|     React Client     |
+----------------------+
           |
           | HTTPS / REST
           v
+----------------------+
|   Spring Boot API    |
+----------------------+
           |
           v
+----------------------+
|      PostgreSQL      |
+----------------------+
```

---

# Technology Stack

## Frontend

- React
- TypeScript
- Vite
- React Router
- Axios

### Responsibilities

- Authentication
- Team Management UI
- Fantasy Dashboard
- Match Monitoring
- Rankings Display

---

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT Authentication
- Flyway

### Responsibilities

- Business Logic
- Authentication & Authorization
- Fantasy Point Calculation
- Match Event Processing
- Transaction Management
- Statistics Generation

---

## Database

- PostgreSQL

### Responsibilities

- Persistent Data Storage
- Transaction History
- Match Statistics
- Fantasy Data
- Historical Seasons

---

# Architectural Layers

## Presentation Layer

### Components

- React Pages
- React Components
- Forms
- Tables
- Dashboards

### Responsibilities

- User Interaction
- Input Validation
- API Communication

---

## API Layer

### Components

- REST Controllers

Examples:

- AuthController
- MatchController
- PlayerController
- FantasyTeamController
- TradeController

### Responsibilities

- Request Handling
- Response Generation
- Validation

---

## Service Layer

### Components

- Authentication Service
- Match Service
- Statistics Service
- Fantasy Service
- Trade Service
- Lineup Service

### Responsibilities

- Execute Business Rules
- Coordinate System Workflows
- Process Domain Logic

---

## Persistence Layer

### Components

- JPA Repositories

Examples:

- UserRepository
- MatchRepository
- PlayerRepository
- TradeRepository

### Responsibilities

- Data Access
- Queries
- Persistence Operations

---

# Security Architecture

## Authentication

Users authenticate with:

- Email
- Password

---

## Authorization

Role-based access control (RBAC).

### Roles

- ADMIN
- MANAGER
- SCOREKEEPER

---

## JWT Flow

```text
Login
 ↓
JWT Generated
 ↓
JWT Sent To Client
 ↓
JWT Included In Requests
 ↓
Request Authorized
```

---

# Core Architectural Workflows

## Match Finalization

```text
Scorekeeper
 ↓
Finalize Match
 ↓
Generate Statistics
 ↓
Calculate Fantasy Points
 ↓
Update Fantasy Teams
 ↓
Update Rankings
```

---

## Transfer Workflow

```text
Trade Proposal
 ↓
Acceptance
 ↓
Roster Update
 ↓
Transaction Generation
```

---

# Data Management Strategy

## Current State Storage

Current roster ownership is stored in:

```text
FantasyTeamPlayer
```

---

## Historical Storage

Historical operations are stored in:

```text
Transaction
```

---

## Statistics Storage

Match events generate:

```text
PlayerStatistics
```

after match finalization.

---

# Deployment Architecture

## Frontend

Recommended:

- Vercel
- Netlify

---

## Backend

Recommended:

- Railway
- Render

---

## Database

Recommended:

- Neon PostgreSQL
- Supabase PostgreSQL

---

# Scalability Considerations

The architecture supports:

- Multiple Seasons
- Historical Data Retention
- Additional Statistics Types
- Expanded Fantasy Rules
- Mobile Client Integration

---

# Summary

The Fantasy Tournament Platform follows a modern layered architecture based on React, Spring Boot and PostgreSQL.

The architecture separates presentation, business logic and persistence responsibilities while supporting fantasy gameplay, tournament management and long-term historical tracking.

