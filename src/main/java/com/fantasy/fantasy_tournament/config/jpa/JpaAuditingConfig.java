package com.fantasy.fantasy_tournament.config.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
 * Enables automatic population of
 * @CreatedDate and @LastModifiedDate fields.
 */
@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {
}