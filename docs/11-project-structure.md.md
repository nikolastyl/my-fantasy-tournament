# 11 - Project Structure

## Technology Stack
- Java 21
- Spring Boot 3
- PostgreSQL
- Spring Security
- JWT Authentication
- Flyway
- Maven

## Package Structure

src/main/java/com/fantasy

- config
- security
- common
- season
- user
- player
- realteam
- fantasyteam
- draft
- lineup
- match
- matchevent
- scoring
- trade
- standings

Each module contains:
- controller
- service
- repository
- entity
- dto
- mapper

## Design Rules
- Controllers only handle HTTP requests.
- Services contain business logic.
- Repositories access the database.
- DTOs are used for API communication.
- Entities are persistence objects.
- Validation is performed at API boundaries.
