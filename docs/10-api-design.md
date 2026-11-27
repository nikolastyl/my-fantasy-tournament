# API Design

## Purpose

This document defines the REST API structure of the Fantasy Tournament Platform.

---

# Authentication

## Login

POST /api/auth/login

## Forgot Password

POST /api/auth/forgot-password

## Reset Password

POST /api/auth/reset-password

---

# Seasons

## Get Seasons

GET /api/seasons

## Create Season

POST /api/seasons

## Update Season

PUT /api/seasons/{id}

---

# Teams

## Get Teams

GET /api/teams

## Create Team

POST /api/teams

## Update Team

PUT /api/teams/{id}

---

# Players

## Get Players

GET /api/players

## Get Player

GET /api/players/{id}

## Create Player

POST /api/players

## Update Player

PUT /api/players/{id}

---

# Matches

## Get Matches

GET /api/matches

## Get Match

GET /api/matches/{id}

## Record Event

POST /api/matches/{id}/events

## Finalize Match

POST /api/matches/{id}/finalize

---

# Lineups

## Get Lineup

GET /api/lineups/{roundId}

## Save Lineup

POST /api/lineups

---

# Fantasy Teams

## Get My Team

GET /api/fantasy-teams/me

## Get Fantasy Team

GET /api/fantasy-teams/{id}

---

# Trades

## Create Trade

POST /api/trades

## Accept Trade

POST /api/trades/{id}/accept

## Reject Trade

POST /api/trades/{id}/reject

---

# Transactions

## Get Transactions

GET /api/transactions

---

# Rankings

## Get Rankings

GET /api/rankings

---

# Market

## Available Players

GET /api/market/players

---

# Standard Response

```json
{
  "success": true,
  "data": {}
}
```

---

# Standard Error Response

```json
{
  "success": false,
  "message": "Validation Error"
}
```
