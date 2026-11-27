# 12 - Database Schema

## Main Tables

### users
- id
- email
- password
- first_name
- last_name
- role

### seasons
- id
- name
- status

### real_teams
- id
- season_id
- name
- logo_url

### players
- id
- season_id
- team_id
- first_name
- last_name
- photo_url
- age

### fantasy_teams
- id
- season_id
- manager_id
- name
- logo_url
- total_points

### fantasy_team_players
- fantasy_team_id
- player_id
- role (STARTER/BENCH)
- is_captain

### matches
- id
- season_id
- home_team_id
- away_team_id
- home_score
- away_score
- status

### match_events
- id
- match_id
- player_id
- event_type

### standings
- fantasy_team_id
- total_points
- rank

### trades
- id
- from_manager
- to_manager
- status

## Constraints
- UNIQUE(player_id, match_id) where needed for aggregated stats.
- Foreign keys on all relationships.
