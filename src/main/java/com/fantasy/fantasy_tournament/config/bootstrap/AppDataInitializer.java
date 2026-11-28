package com.fantasy.fantasy_tournament.config.bootstrap;

import com.fantasy.fantasy_tournament.domain.user.Role;
import com.fantasy.fantasy_tournament.domain.user.User;
import com.fantasy.fantasy_tournament.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
@RequiredArgsConstructor
public class AppDataInitializer implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) {

         //We create the initial ADMIN only the first time.

        if (userService.existsByEmail("admin@fantasy.com")) {
            return;
        }

        User admin = User.builder()
                .firstName("System")
                .lastName("Administrator")
                .email("admin@fantasy.com")
                .password("CHANGE_ME")
                .role(Role.ADMIN)
                .build();

        userService.save(admin);

        System.out.println("Default admin created.");
    }
}